package com.example.generics.coursemanagementsystem;

public class AssignmentCourse extends CourseType{
    public AssignmentCourse(String name, String duration, double price) {
        super(name, duration, price);
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Assignment-Based Course: ");
        System.out.println("Course name: "+getName());
        System.out.println("Course price: "+getPrice());
        System.out.println("Course duration: "+getDuration());
    }
}
