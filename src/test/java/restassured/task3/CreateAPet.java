package restassured.task3;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.Matchers.equalTo;

/**
 * Create a PET using the POST call from http://petstore.swagger.io/#/
 * <p>
 * Request Body:
 * {
 * "id": 12345,
 * "category": {
 * "id": 1,
 * "name": "dog"
 * },
 * "name": "snoopie",
 * "photoUrls": [
 * "string"
 * ],
 * "tags": [
 * {
 * "id": 0,
 * "name": "string"
 * }
 * ],
 * "status": "pending"
 * }
 * <p>
 * once the pet is created write the test cases using REST assured for the below calls
 * <p>
 * https://petstore.swagger.io/v2/pet/12345
 * GET call
 * Validate the below from API response:
 * <p>
 * That the status code is equal to ‘200’
 * That the content type is ‘application/json’
 * That if the pet is a ‘dog’
 * That its name is ‘snoopie’
 * That its current status is ‘pending’
 * <p>
 * task - 2:(test data might be already present)
 * https://jsonplaceholder.typicode.com/users
 * GET call
 * Validate the below from API response:
 * <p>
 * That the status code is equal to ‘200’
 * That there more than ‘3’ users in the list
 * That one of the users has a name of “Ervin Howell”
 */
public class CreateAPet {
    public static RequestSpecification requestSpecification;
    public static Response response;
    public static MatcherAssert matcherAssert;

    public static void main(String[] args) {
        createAPet(requestSpecification);
        getCallToValidatePet(response);
    }

    private static void getCallToValidatePet(Response response) {
        JsonPath jsonPath = response.jsonPath();
        MatcherAssert.assertThat("pending", equalTo(jsonPath.get("status")));
        MatcherAssert.assertThat("dog", equalTo(jsonPath.get("category.name")));
        MatcherAssert.assertThat("snoopie", equalTo(jsonPath.get("name")));
        MatcherAssert.assertThat(200, equalTo(response.statusCode()));
        MatcherAssert.assertThat("application/json", equalTo(response.contentType()));
    }

    private static void createAPet(RequestSpecification requestSpecification) {
        String requestBody = "{\n" +
                "  \"id\": 12346,\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"dog\"\n" +
                "  },\n" +
                "  \"name\": \"snoopie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"pending\"\n" +
                "}";
        /**
         * for POST Content type is mostly needed and for default we have to give content type
         */
        requestSpecification = RestAssured.given().baseUri("https://petstore.swagger.io/v2/pet").
                body(requestBody).header("Content-Type", "application/json");
        response = requestSpecification.post().then().log().all().extract().response();
    }

}
