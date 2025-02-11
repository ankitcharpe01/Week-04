package com.example.generics.personalizedmealplangenerator;

public class HighProteinMeal implements MealPlan {
    private String mealName;
    public HighProteinMeal(String mealName){
        this.mealName=mealName;
    }
    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void display() {
        System.out.println("---High Protein---");
        System.out.println("Meal name : "+mealName);
    }
}