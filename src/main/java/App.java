import static spark.Spark.*;

public class App {
    public static final String LOCALPATH = "http://localhost:4567/";

    public static void main(String[] args) {
        get("/login", (request, response) ->
                process.HTMLtoString.loadHTML("/Users/sudarshan/Github/ieor185/src/main/java/html/ClientLogin.html")
        );

        get("/survey", (request, response) ->
                process.HTMLtoString.loadHTML("/Users/sudarshan/Github/ieor185/src/main/java/html/ClientSurvey.html")
        );

        get("/end", (request, response) ->
                process.HTMLtoString.loadHTML("/Users/sudarshan/Github/ieor185/src/main/java/html/ClientLogin.html")
        );
    }
}