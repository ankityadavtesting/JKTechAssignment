package utils;

public interface IConfig {
    // BASE URI
    final String BASEURI="http://127.0.0.1:8000/";

    //********** Books End Point *******************

    final String deleteBook="/books";
    final String NewBOOK = "/books";
    final String updateBook = "/books";
    final String GetBooks="/books";
    final String GetBookById="/books";

    //************** User Authentication
    final String Signup="/signup";
    final String login="/login";

    //******************** Health check
    final String health="/health";



    // ******************** Payload details
    final String SignupFile = "src/test/resources/payloads/SignupPayload.json";
    final String LoginFile = "src/test/resources/payloads/LoginPayload.json";
}
