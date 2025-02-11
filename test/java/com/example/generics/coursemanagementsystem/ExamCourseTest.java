package com.example.generics.coursemanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamCourseTest {
    private ExamCourse examCourse;

    @BeforeEach
    public void setUp(){
        examCourse = new ExamCourse("Physics Crash Course","15 Days",6000) ;
    }

    @Test
    public void testCourseName(){
        assertEquals("Physics Crash Course", examCourse.getName());
    }

    @Test
    public void testCourseDuration(){
        assertEquals("15 Days", examCourse.getDuration());
    }

    @Test
    public void testCoursePrice(){
        assertEquals(6000,examCourse.getPrice());
    }
}