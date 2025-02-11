package com.example.generics.aidrivenresumescreeningsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResumeTest {
    @Test
    public void testSoftwareEngineer(){
        Resume<SoftwareEngineerRole> s=new Resume<>();
        s.addResume(new SoftwareEngineerRole("Aliya",2,"B.Tech"));
        assertEquals("Aliya",s.getResume(0).getCandidateName());
    }
    @Test
    public void testProductManager(){
        Resume<ProductManagerRole> p=new Resume<>();
        p.addResume(new ProductManagerRole("Chef",1,"M.Tech"));
        assertEquals(1,p.getResume(0).getExperience());
    }
    @Test
    public void testDataScientist(){
        Resume<DataScientistRole> d=new Resume<>();
        d.addResume(new DataScientistRole("Chef",5,"Data Science"));
        assertEquals("Data Science",d.getResume(0).getHighestQualification());
    }
}