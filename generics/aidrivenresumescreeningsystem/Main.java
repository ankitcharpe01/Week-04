package com.example.generics.aidrivenresumescreeningsystem;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineerRole> softwareEngineerRoleResume=new Resume<>();
        softwareEngineerRoleResume.addResume(new SoftwareEngineerRole("Aliya",2,"B.Tech"));
        softwareEngineerRoleResume.addResume(new SoftwareEngineerRole("Ram",3,"B.Tech"));

        Resume<ProductManagerRole>productManagerRoleResume=new Resume<>();
        productManagerRoleResume.addResume(new ProductManagerRole("Chef",9,"M.Tech"));
        productManagerRoleResume.addResume(new ProductManagerRole("Shyam",12,"M.Tech"));

        Resume<DataScientistRole> dataScientistRoleResume=new Resume<>();
        dataScientistRoleResume.addResume(new DataScientistRole("Eric",6,"Data Science"));
        dataScientistRoleResume.addResume(new DataScientistRole("Frank",8,"Artificial Engineering"));

        softwareEngineerRoleResume.displayResumes(softwareEngineerRoleResume.getListOfResume());
        System.out.println("--------------------------------");
        productManagerRoleResume.displayResumes(productManagerRoleResume.getListOfResume());
        System.out.println("---------------------------------");
        dataScientistRoleResume.displayResumes(dataScientistRoleResume.getListOfResume());
    }
}
