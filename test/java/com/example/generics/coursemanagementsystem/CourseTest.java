package com.example.generics.coursemanagementsystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    private Course<ExamCourse> exam;
    private ExamCourse e1;
    private ExamCourse e2;

    @BeforeEach
    void setUp() {
       exam = new Course<>();
        e1 = new ExamCourse("Physics Crash Course", "15 Days", 6000);
        e2 = new ExamCourse("GATE Exam", "6 Months", 7000);
        exam.assign(e1);
        exam.assign(e2);
    }

    @Test
    void testAddItem() {
        assertEquals(2, exam.getList().size());
    }

    @Test
    void testGetList() {
        List<ExamCourse> list = exam.getList();
        assertTrue(list.contains(e1));
        assertTrue(list.contains(e2));
    }
}