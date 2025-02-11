package com.example.generics.aidrivenresumescreeningsystem;

public class ProductManagerRole extends JobRole{
    public ProductManagerRole(String candidateName, int experience, String highestQualification) {
        super(candidateName, experience, highestQualification,"Product Manager");
    }

    @Override
    public void display() {
        System.out.println("---Product Manager---");
        System.out.println("Name : "+getCandidateName());
        System.out.println("Highest Qualification : "+getHighestQualification());
        System.out.println("Experience : "+getExperience()+" years");
    }
}
