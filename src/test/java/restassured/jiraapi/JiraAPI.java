package restassured.jiraapi;

import com.sun.net.httpserver.Request;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class JiraAPI {
    public static void main(String[] args) {
        RequestSpecification requestSpecification = new RequestSpecBuilder().build().given().baseUri("");
        createAJiraDefect();
    }

    private static void createAJiraDefect() {

    }
}
