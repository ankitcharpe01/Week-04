package com.example.generics.aidrivenresumescreeningsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoftwareEngineerRoleTest {
    private ProductManagerRole role;
    @BeforeEach
    public void setUp(){
        role = new ProductManagerRole("Aliya",2,"B.Tech");
    }

    @Test
    public void testGetCandidateName() {
        assertEquals("Aliya",role.getCandidateName());
    }

    @Test
    public void testGetExperience(){
        assertEquals(2,role.getExperience());
    }

    @Test
    public void testGetHighestQualification(){
        assertEquals("B.Tech",role.getHighestQualification());
    }
}