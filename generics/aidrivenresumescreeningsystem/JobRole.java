package com.example.generics.aidrivenresumescreeningsystem;
public abstract class JobRole {
    private String candidateName;
    private int experience;
    private String highestQualification;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public JobRole(String candidateName, int experience, String highestQualification, String role) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.highestQualification = highestQualification;
        this.role = role;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(String highestQualification) {
        this.highestQualification = highestQualification;
    }
    public abstract void display();
}
