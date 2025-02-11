package com.example.generics.coursemanagementsystem;

public class Main {

    public static void main(String[] args) {

    ExamCourse exam1 = new ExamCourse("Physics Crash Course","15 Days",6000);
    ExamCourse exam2 = new ExamCourse("GATE","6 Months",7000);
    AssignmentCourse assignment1 = new AssignmentCourse("Programming","2 Months",3000);
    AssignmentCourse assignment2 = new AssignmentCourse("Object Oriented Programming","3 Months",4000);
    ResearchCourse research1 = new ResearchCourse("Physics","4 Months",5999);
    ResearchCourse research2 = new ResearchCourse("Biology","6 Months",6999);
    Course<ExamCourse> examCourse = new Course<>();
    examCourse.assign(exam1);
    examCourse.assign(exam2);

    Course<AssignmentCourse> assignmentCourse = new Course<>();
    assignmentCourse.assign(assignment1);
    assignmentCourse.assign(assignment2);

    Course<ResearchCourse>reseacrchCourse = new Course<>();
    reseacrchCourse.assign(research1);
    reseacrchCourse.assign(research2);

    examCourse.displayAllItems(examCourse.getList());
    System.out.println("----------------------------");
    assignmentCourse.displayAllItems(assignmentCourse.getList());
    System.out.println("----------------------------");
    reseacrchCourse.displayAllItems(reseacrchCourse.getList());
    }
}
