package com.example.generics.coursemanagementsystem;

import com.example.generics.smartwarehousesystem.Electronics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResearchCourseTest {
    private ResearchCourse researchCourse;

    @BeforeEach
    void setUp() {
       researchCourse = new ResearchCourse("Physics", "4 Months", 5999);
    }

    @Test
    void testGetName() {
        assertEquals("Physics", researchCourse.getName());
    }

    @Test
    void testGetDuration() {
        assertEquals("4 Months", researchCourse.getDuration());
    }

    @Test
    void testGetPrice() {
        assertEquals(5999, researchCourse.getPrice());
    }
}