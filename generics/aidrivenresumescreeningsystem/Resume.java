package com.example.generics.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Resume <T extends JobRole>{
    private List<T> listOfResume;
    public Resume(){
        listOfResume=new ArrayList<>();
    }
    public void addResume(T resume){
        listOfResume.add(resume);
    }
    public T getResume(int index){
        return listOfResume.get(index);
    }

    public List<T> getListOfResume() {
        return listOfResume;
    }
    public void displayResumes(List<? extends JobRole> listOfResumes){
        for (JobRole resume:listOfResumes){
            resume.display();
        }
    }
}
