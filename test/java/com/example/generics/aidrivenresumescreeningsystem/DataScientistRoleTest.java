package com.example.generics.aidrivenresumescreeningsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataScientistRoleTest {
        private DataScientistRole role;
        @BeforeEach
        public void setUp(){
            role = new DataScientistRole("Alice",3,"B.Tech");
        }

        @Test
        public void testGetCandidateName() {
            assertEquals("Alice",role.getCandidateName());
        }

        @Test
        public void testGetExperience(){
            assertEquals(3,role.getExperience());
        }

        @Test
        public void testGetHighestQualification(){
            assertEquals("B.Tech",role.getHighestQualification());
        }
}