import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;


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
}

public class Main {

    public static void main(String[] argv) {

        List<Elective> database = new ArrayList<>();

        get("/add_course", (request, response) -> {
            return new ModelAndView(null, "add_course.hbs");
        }, new HandlebarsTemplateEngine());

        post("/add_course", (request, response) -> {
            return null;
        });

        get("/list_courses", (request, response) -> {
            return new ModelAndView(null, "list_course.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
