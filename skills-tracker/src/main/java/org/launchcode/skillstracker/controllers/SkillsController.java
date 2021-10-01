package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String baseForm() {
        String html =
                "<html>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                        "</html>";
        return html;
    }

    @GetMapping ("form")
    @ResponseBody
    public String favPrograms() {
        String inputs =
                "<html>" +
                        "<body>" +
                        "<form action='print'>" +
                        "<label for='name'>Enter Name:</label>" +
                        "<br><Input type='text' name='name'>" +
                        "<br><label for='option1'>Choose your favorite programming language:</label>" +
                        "<br><select id='option1' name='option1'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br><label for='option2'>Choose your 2nd favorite programming language:</label>" +
                        "<br><select id='option2' name='option2'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br><label for='option3'>Choose your 3rd favorite programming language:</label>" +
                        "<br><select id='option3' name='option3'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br><Input type='submit' value='Submit'>" +
                        "</form>" +
                        "</body>" +
                        "</html>";

        return inputs;
    }

    @GetMapping ("print")
    @ResponseBody
    public String printFavorites(@RequestParam String name, String option1, String option2, String option3) {
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + option1 + "</li>" +
                "<li>" + option2 + "</li>" +
                "<li>" + option3 + "</li>" +
                "</ol>" +
                "</html>";
    }

}
