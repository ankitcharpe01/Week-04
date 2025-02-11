package com.example.generics.coursemanagementsystem;

public class ExamCourse extends CourseType{
    public ExamCourse(String name, String duration, double price) {
        super(name, duration, price);
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Exam-Based Course: ");
        System.out.println("Course name: "+getName());
        System.out.println("Course price: "+getPrice());
        System.out.println("Course duration: "+getDuration());
    }
}
