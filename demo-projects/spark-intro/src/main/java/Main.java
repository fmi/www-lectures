import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

class Elective {
    private String title;
    private String description;
    private String lecturer;

    Elective(String title, String description, String lecturer) {
        this.title = title;
        this.description = description;
        this.lecturer = lecturer;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String toHTML() {
        // TODO: Implement
        return "<h1>Foo Bar</h1>";
    }
}

public class Main {

    public static void main(String[] argv) {

        Map<String, Elective> data = new HashMap<>();
        data.put("webgl", new Elective("Компютърна графика с WebGL", "...", "доц. П. Бойчев"));
        data.put("go", new Elective("Програмиране с Go", "...", "Николай Бачийски"));

        get("/hello", (req, resp) -> {
            return "<html><body><h1>Hello world!</h1></body></html>";
        });
    }
}
