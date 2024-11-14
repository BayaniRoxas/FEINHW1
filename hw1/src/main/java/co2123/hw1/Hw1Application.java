package co2123.hw1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co2123.hw1.domain.University;
import co2123.hw1.domain.Researcher;


import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Hw1Application {


    // Task 4.1
    public static List<University> universities;
    public static List<Researcher> researchers;

    public static void main(String[] args)   {
        SpringApplication.run(Hw1Application.class, args);

        universities = new ArrayList<>();
        researchers = new ArrayList<>();

        // Initialising our University
        University university = new University();
        university.setId(1);
        university.setChancellor("Dr. Chloe Roxas");
        university.setCampus("Bob Burgess");
        university.setResearchers(new ArrayList<>());
        universities.add(university);

        // Initialising our two researchers
        Researcher researcherOne = new Researcher();
        researcherOne.setName("Marley Roxas");
        researcherOne.setGroup("Group A");
        researcherOne.setArea("Stevenage");
        researcherOne.setGrade(100);

        Researcher researcherTwo = new Researcher();
        researcherTwo.setName("Kim Roxas");
        researcherTwo.setGroup("Group B");
        researcherTwo.setArea("Stevenage");
        researcherTwo.setGrade(100);

        // Add researchers to the university
        university.getResearchers().add(researcherOne);
        university.getResearchers().add(researcherTwo);

        // Also add to the global researchers list
        researchers.add(researcherOne);
        researchers.add(researcherTwo);

    }


}
