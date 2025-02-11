package com.example.generics.personalizedmealplangenerator;
import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
    private List<T> listOfMeals;
    public Meal(){
        listOfMeals=new ArrayList<>();
    }

    public List<T> getListOfMeals() {
        return listOfMeals;
    }
    public T getMeal(int index){
        return listOfMeals.get(index);
    }
    public void add(T meal){
        listOfMeals.add(meal);
    }
    public void displayMeals(){
        for(T meal:listOfMeals){
            meal.display();
        }
    }
}
