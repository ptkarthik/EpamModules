package restassured.task3;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;

import java.util.List;

import static org.hamcrest.Matchers.*;

public class GetCallUserCheck {
    public static void main(String[] args) {
        Response response = RestAssured.given().baseUri("https://jsonplaceholder.typicode.com/users").when().
                get().then().log().all().extract().response();
        validateResponse(response);
    }

    private static void validateResponse(Response response) {
        JsonPath jsonPath = new JsonPath(response.asString());
        MatcherAssert.assertThat(200, equalTo(response.statusCode()));
        List<String> list = jsonPath.getList("id");
        greaterThan(list.size() > 3);
        List<String> name = jsonPath.getList("name");
        MatcherAssert.assertThat(name, hasItem("Ervin Howell"));
    }
}
