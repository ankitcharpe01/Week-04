package com.example.generics.coursemanagementsystem;

public class ResearchCourse extends CourseType{

    public ResearchCourse(String name, String duration, double price) {
        super(name, duration, price);
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Research-Based Course: ");
        System.out.println("Course name: "+getName());
        System.out.println("Course price: "+getPrice());
        System.out.println("Course duration: "+getDuration());
    }
}
