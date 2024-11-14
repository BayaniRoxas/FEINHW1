package co2123.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {

    // Handle GET request
    @RequestMapping("/")
    public String showStartPage() {
        return "start"; // Returns the "start" view
    }

    // Handle POST request to "/"
//    @RequestMapping("/")
//    public String handlePostRequest() {
//        return "start"; // Returns the "start" view
//    }
}
