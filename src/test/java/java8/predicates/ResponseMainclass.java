package java8.predicates;

import java.util.ArrayList;
import java.util.List;

public class ResponseMainclass {
    public static void main(String[] args) {
        Response success =
                new Response("Success", 200, "JSON");
        Response serverError =
                new Response("Server Error", 400, "XML");
        Response serverErrorJson =
                new Response("Server Error", 400, "Json");
        Response clientError =
                new Response("Client Error", 500, "JSON");
        List<Response> listOfResponses = new ArrayList<Response>();
        listOfResponses.add(success);
        listOfResponses.add(serverError);
        listOfResponses.add(clientError);
        listOfResponses.add(serverErrorJson);
        find400responses(listOfResponses);
        findJsonOnlyTypes(listOfResponses);
        findJsonAnd400Types(listOfResponses);
        findJsonOr400Types(listOfResponses);
        findJsonNot400OnlyJson(listOfResponses);

    }

    private static void findJsonOnlyTypes(List<Response> listOfResponses) {
        listOfResponses.stream().filter(response -> response.getResponseType().equalsIgnoreCase("json")).
                forEach(response -> System.out.println(response.toString()));
    }

    private static void findJsonAnd400Types(List<Response> listOfResponses) {
        listOfResponses.stream().filter(response -> response.getResponseType().equalsIgnoreCase("json") &&
                        response.getStatusCode() == 400).
                forEach(response -> System.out.println(response.toString()));
    }

    private static void findJsonNot400OnlyJson(List<Response> listOfResponses) {
        listOfResponses.stream().filter(response -> response.getResponseType().equalsIgnoreCase("json") &&
                        response.getStatusCode() != 400).
                forEach(response -> System.out.println(response.toString()));
    }

    private static void findJsonOr400Types(List<Response> listOfResponses) {
        listOfResponses.stream().filter(response -> response.getResponseType().equalsIgnoreCase("json") ||
                        response.getStatusCode() == 400).
                forEach(response -> System.out.println(response.toString()));
    }

    private static void find400responses(List<Response> listOfResponses) {
        listOfResponses.stream().filter(response -> response.getStatusCode() == 400).
                forEach(response -> System.out.println(response.getResponseType() + " " + response.getResponseBody()));
    }
}
