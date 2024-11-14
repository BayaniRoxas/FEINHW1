package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Researcher;
import co2123.hw1.domain.University;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller

public class ResearcherController {
    // Binds the controller class to the validator class
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new ResearcherValidator());
    }

    // GET request to display list of researchers for a specific university
    @GetMapping("/researchers")
    public String showResearchers(@RequestParam("university") int universityId, Model model) {

        // Loops through the input and the array of universities
        for (University university : Hw1Application.universities) {
            if (university.getId() == universityId) {
                model.addAttribute("researchers", university.getResearchers());
                model.addAttribute("universityId", universityId);
            }

        }

        return "researchers/list"; // Returns "researchers/list" view
    }

    // GET request to display new researcher
    @GetMapping("/newResearcher")
    public String showResearcherForm( @RequestParam("university") int universityId, Model model) {
        model.addAttribute("universityId", universityId);
        model.addAttribute("researcher", new Researcher());
        return "researchers/form";  // form.jsp
    }

    // POST request to add a new researcher
    @PostMapping("/addResearcher")
    public String addResearcher(@Valid @ModelAttribute Researcher researcher, BindingResult result, @RequestParam("university") int universityId, Model model) {

        // Code to run if an error is found
        if (result.hasErrors()) {
            // Ensures that after a submit is made, it still returns universityId to allow the code to run again
            model.addAttribute("universityId", universityId);
            model.addAttribute("researcher", researcher);
            return "researchers/form";
        }

        // Loops through the array of universities, find it by its ID and stores it
        University foundUniversity = null;
        for (University u : Hw1Application.universities) {
            if (u.getId() == universityId) {
                foundUniversity = u;
                break;  // Stop the loop once we find the university
            }
        }

        Optional<University> university = Optional.ofNullable(foundUniversity);

        // If university does exist, the researcher gets added to the universitys list
        if (university.isPresent()) {
            university.get().getResearchers().add(researcher);
            Hw1Application.researchers.add(researcher);
        }
        return "redirect:/universities"; // Redirect back to the researchers list
    }

}
