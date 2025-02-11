package com.example.generics.aidrivenresumescreeningsystem;

public class SoftwareEngineerRole extends JobRole{
    public SoftwareEngineerRole(String candidateName, int experience, String highestQualification) {
        super(candidateName, experience, highestQualification,"Software Engineer");
    }

    @Override
    public void display() {
        System.out.println("---Software Engineer---");
        System.out.println("Name : "+getCandidateName());
        System.out.println("Highest Qualification : "+getHighestQualification());
        System.out.println("Experience : "+getExperience()+" years");

    }
}
