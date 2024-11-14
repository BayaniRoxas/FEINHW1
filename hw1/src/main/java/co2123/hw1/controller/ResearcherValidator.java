package co2123.hw1.controller;

import co2123.hw1.domain.Researcher;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;




public class ResearcherValidator implements Validator {
    // Two methods that victoria said we needed
    @Override
    public boolean supports(Class<?> clazz) {
        return Researcher.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Researcher researcher = (Researcher) target;


        // Checks to see if researcher and group name is empty, returns error if empty or whitespace
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Name of researcher is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "group", "", "Group name is required.");

        // Checks to see if area is a part of the three HCI, Machine Learning, or Theory
        if (researcher.getArea() != null && !researcher.getArea().isEmpty()) {
            if (!researcher.getArea().equals("Human Computer Interaction") &&
                    !researcher.getArea().equals("Machine Learning") &&
                    !researcher.getArea().equals("Theory")) {
                errors.rejectValue("area", "", "Area must be 'Human Computer Interaction', 'Machine Learning', or 'Theory'.");
            }
        } else {
            errors.rejectValue("area", "", "Area is required.");
        }

        // Gets researcher grade, checks if its in between 7 and 10
        if (researcher.getGrade() < 7 || researcher.getGrade() > 10) {
            errors.rejectValue("grade", "", "Value needs to be between 7 and 10");
        }
    }
}
