package com.example.generics.personalizedmealplangenerator;


public class KetoMeal implements MealPlan{
    private String mealName;

    public KetoMeal(String mealName){
        this.mealName=mealName;
    }
    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void display() {
        System.out.println("---Keto Meal---");
        System.out.println("Meal name : "+mealName);
    }
}

