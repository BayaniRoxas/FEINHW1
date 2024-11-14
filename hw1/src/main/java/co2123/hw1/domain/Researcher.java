package co2123.hw1.domain;

import java.util.ArrayList;
import java.util.List;


public class Researcher {
    // Fields
    private String name;
    private String group;
    private String area;
    private int grade;

    // Set functions
    public void setName(String name){
        this.name = name;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setGrade(int grade) { this.grade = grade; }

    // Get functions
    public String getName(){
        return this.name;
    }
    public String getGroup(){
        return this.group;
    }
    public String getArea(){
        return this.area;
    }
    public int getGrade(){
        return this.grade;
    }
}

