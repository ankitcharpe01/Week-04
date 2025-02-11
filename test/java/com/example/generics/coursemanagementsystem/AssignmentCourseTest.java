package com.example.generics.coursemanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentCourseTest {
    private AssignmentCourse assignmentCourse;

    @BeforeEach
    public void setUp(){
        assignmentCourse = new AssignmentCourse("GATE","6 Months",7000) ;
    }

    @Test
    public void testCourseName(){
        assertEquals("GATE",assignmentCourse.getName());
    }

    @Test
    public void testCourseDuration(){
        assertEquals("6 Months", assignmentCourse.getDuration());
    }

    @Test
    public void testCoursePrice(){
        assertEquals(7000,assignmentCourse.getPrice());
    }
}