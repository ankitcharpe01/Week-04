package com.example.generics.personalizedmealplangenerator;

public class VeganMeal implements MealPlan{
    private String mealName;
    public VeganMeal(String mealName){
        this.mealName=mealName;
    }
    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void display() {
        System.out.println("---Vegan Meal---");
        System.out.println("Meal name : "+mealName);
    }
}

