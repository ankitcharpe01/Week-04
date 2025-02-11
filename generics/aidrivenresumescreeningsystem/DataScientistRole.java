package com.example.generics.aidrivenresumescreeningsystem;


public class DataScientistRole extends JobRole{
    public DataScientistRole(String candidateName, int experience, String highestQualification) {
        super(candidateName, experience, highestQualification, "Data Scientist");
    }

    @Override
    public void display() {
        System.out.println("---Data Scientist---");
        System.out.println("Name : "+getCandidateName());
        System.out.println("Highest Qualification : "+getHighestQualification());
        System.out.println("Experience : "+getExperience()+" years");

    }
}
