package oop.inheritance.parse;

import java.util.Set;

public class Developer {

    private String name;

    private String specialization;

    private Set<String> strengths;

    private Integer motivation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Set<String> getStrengths() {
        return strengths;
    }

    public void setStrengths(Set<String> strengths) {
        this.strengths = strengths;
    }

    public Integer getMotivation() {
        return motivation;
    }

    public void setMotivation(Integer motivation) {
        this.motivation = motivation;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", strengths=" + strengths +
                ", motivation=" + motivation +
                '}';
    }
}
