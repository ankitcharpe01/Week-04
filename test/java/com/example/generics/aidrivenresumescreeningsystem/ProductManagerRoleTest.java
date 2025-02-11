package com.example.generics.aidrivenresumescreeningsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProductManagerRoleTest {
    private ProductManagerRole role;
    @BeforeEach
    public void setUp(){
        role = new ProductManagerRole("Bob",6,"M.Tech");
    }

    @Test
    public void testGetCandidateName() {
        assertEquals("Bob",role.getCandidateName());
    }

    @Test
    public void testGetExperience(){
        assertEquals(6,role.getExperience());
    }

    @Test
    public void testGetHighestQualification(){
        assertEquals("M.Tech",role.getHighestQualification());
    }
}