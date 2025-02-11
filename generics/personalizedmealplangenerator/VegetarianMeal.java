package com.example.generics.personalizedmealplangenerator;

public class VegetarianMeal implements MealPlan{
    private String mealName;
    public VegetarianMeal(String mealName){
        this.mealName=mealName;
    }
    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void display() {
        System.out.println("---Vegetarian Meal---");
        System.out.println("Meal name : "+mealName);
    }
}
