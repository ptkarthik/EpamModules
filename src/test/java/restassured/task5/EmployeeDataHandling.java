package restassured.task5;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;

import java.security.SecureRandom;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;

public class EmployeeDataHandling {
    public static void main(String[] args) {

        Response response=RestAssured.given().baseUri("https://jsonplaceholder.typicode.com").log().all()
                .when().get("/users").then().log().all().extract().response();

        validateTheCountOfEmployees(response);
        String body ="{\n" +
                "    \"userId\": 200,\n" +
                "    \"id\": 209,\n" +
                "    \"title\": \"English title\",\n" +
                "    \"body\": \"Enlish is the versatile language\"\n" +
                "  }";
        Response createEmployeeResponse=RestAssured.given().baseUri("https://jsonplaceholder.typicode.com").body(body).log().all()
                .when().post("/posts").then().log().all().extract().response();
        createAnEmployee(createEmployeeResponse);
        String bodyUpdate ="{\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"Tamil\",\n" +
                "    \"body\": \"tamil is the oldest language\"\n" +
                "  }";
        Response createResponseUsers=RestAssured.given().baseUri("https://jsonplaceholder.typicode.com").
                body(bodyUpdate).log().all()
                .when().put("/posts/1").then().log().all().extract().response();
        updateTheUsers(createResponseUsers);
        SecureRandom secureRandom= new SecureRandom();
        int recordNumber=secureRandom.nextInt(100);
        Response deleteRecord=RestAssured.given().baseUri("https://jsonplaceholder.typicode.com").
                body(bodyUpdate).log().all()
                .when().put("/posts/"+recordNumber+"/").then().log().all().extract().response();
        deleteTheUsers(deleteRecord,recordNumber);
    }

    private static void deleteTheUsers(Response deleteRecord, int recordNumber) {
        JsonPath jsonPath=deleteRecord.jsonPath();
        String title=jsonPath.getString("id");
        MatcherAssert.assertThat(String.valueOf(recordNumber),equalTo(title));
        MatcherAssert.assertThat("HTTP/1.1 200 OK",equalTo(deleteRecord.statusLine()));
        MatcherAssert.assertThat("application/json; charset=utf-8",equalTo(deleteRecord.contentType()));
    }

    private static void updateTheUsers(Response response) {
        JsonPath jsonPath=response.jsonPath();
        String title=jsonPath.getString("id");
        MatcherAssert.assertThat("1",equalTo(title));
        MatcherAssert.assertThat("HTTP/1.1 200 OK",equalTo(response.statusLine()));
        MatcherAssert.assertThat("application/json; charset=utf-8",equalTo(response.contentType()));
    }

    private static void createAnEmployee(Response response){
        System.out.println(" the Response is "+response.asString());
        MatcherAssert.assertThat(response.getStatusCode(), equalTo(201));
        JsonPath jsonPath=response.jsonPath();
        System.out.println("The JsonPath is "+jsonPath);
        String title=jsonPath.getString("id");
        MatcherAssert.assertThat("101",equalTo(title));
        MatcherAssert.assertThat("HTTP/1.1 201 Created",equalTo(response.statusLine()));
        MatcherAssert.assertThat("application/json; charset=utf-8",equalTo(response.contentType()));
    }

    private static void validateTheCountOfEmployees(Response response) {
        JsonPath jsonPath=response.jsonPath();
        List<String> listPFId= jsonPath.get("id");
        MatcherAssert.assertThat(10,equalTo(listPFId.size()));
    }
}
