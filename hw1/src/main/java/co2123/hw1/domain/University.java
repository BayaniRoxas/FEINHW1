package co2123.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class University {
    // Fields
    private int id;
    private String chancellor;
    private String campus;
    private List<Researcher> researchers = new ArrayList<>();

    // Set functions
    public void setId(int id){
        this.id = id;
    }
    public void setChancellor(String chancellor){
        this.chancellor = chancellor;
    }
    public void setCampus(String campus){
        this.campus = campus;
    }
    public void setResearchers(List<Researcher> researchers){
        this.researchers = researchers;
    }

    // Get functions
    public int getId() {
        return this.id;
    }
    public String getChancellor() {
        return this.chancellor;
    }
    public String getCampus() {
        return this.campus;
    }
    public List<Researcher> getResearchers() {
        return this.researchers;
    }


}
