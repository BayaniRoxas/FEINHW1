package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.University;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class UniversityValidator implements Validator {
    // Victoria added these two classes
    @Override
    public boolean supports(Class<?> clazz) {
        return University.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        University university = (University) target;

        // Looping through the list, this is to check that the thing we input is unique
        for(University ex : Hw1Application.universities){
            if(university.getId() == ex.getId()){
                errors.rejectValue("id", "", "id is already in use.");

            }
        }
        // Checks if the chancellor and campus is empty / whitespace
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "chancellor", "", "chancellor name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "campus", "", "campus name is required.");
    }
}
