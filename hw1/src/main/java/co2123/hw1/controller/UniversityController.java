package co2123.hw1.controller;

// importing other sides of the application to this one
import co2123.hw1.Hw1Application;
import co2123.hw1.domain.University;


// This is my springframe work imports
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;


// My controller, configuring the mapping URLs
@Controller
@RequestMapping("/universities")
public class UniversityController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new UniversityValidator());
    }

    // GET request to display the list of universities
    @GetMapping
    public String showUniversities(Model model) {
        model.addAttribute("universities", Hw1Application.universities);
        return "universities/list"; // Returns the "universities/list" view
    }

    // GET request to display the University for creating a new university
    @GetMapping("/newUniversity")
    public String showUniversityForm(Model model) {
        model.addAttribute("university", new University());
        return "universities/form"; // Returns the "universities/form" view
    }

    // POST request to add a new university
    @PostMapping("/addUniversity")
    public String addUniversity(@Valid @ModelAttribute University university, BindingResult result) {

        if (result.hasErrors()) {
            return "universities/form";
        }

        Hw1Application.universities.add(university);
        return "redirect:/universities"; // Redirects to the list of universities
    }

}