package com.example.generics.coursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course <T extends CourseType>{
    List<T> list;
    public Course(){
        this.list=new ArrayList<>();
    }
    public void assign(T course){
        list.add(course);
    }
    public List<T> getList(){
        return list;
    }
    public void displayAllItems(List<? extends CourseType> courses){
        for(CourseType course:courses){
            course.displayCourseInfo();
        }
    }
}
