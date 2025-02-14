package com.example.collections.queueInterface.hospitaltriagesystem;

public class Patient implements Comparable<Patient>{
        private String name;
        private int priority;

    public Patient(String name, int priority){
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo (Patient o){
            return o.priority-this.priority ;
        }

        @Override
        public String toString () {
            return "HospitalTriageSystem{" +
                    "name='" + name + '\'' +
                    ", priority=" + priority +
                    '}';
        }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
