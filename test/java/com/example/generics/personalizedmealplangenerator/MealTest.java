package com.example.generics.personalizedmealplangenerator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MealTest {
    @Test
    public void testVegetarian(){
        Meal<VegetarianMeal> v=new Meal<>();
        v.add(new VegetarianMeal("Dosa"));
        assertEquals("Dosa",v.getMeal(0).getMealName());
    }
    @Test
    public void testVegan(){
        Meal<VeganMeal> v=new Meal<>();
        v.add(new VeganMeal("Tofu salad"));
        assertEquals("Tofu salad",v.getMeal(0).getMealName());
    }
    @Test
    public void testKeto(){
        Meal<KetoMeal> k=new Meal<>();
        k.add(new KetoMeal("Low carb cheese taco shells"));
        assertEquals("Low carb cheese taco shells",k.getMeal(0).getMealName());
    }
    @Test
    public void testHighProtein(){
        Meal<HighProteinMeal> h=new Meal<>();
        h.add(new HighProteinMeal("pulses"));
        assertEquals("pulses",h.getMeal(0).getMealName());
    }
}