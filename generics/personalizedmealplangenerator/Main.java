package com.example.generics.personalizedmealplangenerator;


public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegetarian=new Meal<>();
        vegetarian.add(new VegetarianMeal("Dosa"));
        vegetarian.add(new VegetarianMeal("Pav Bhaji"));

        Meal<VeganMeal> vegan=new Meal<>();
        vegan.add(new VeganMeal("Tofu Salad"));
        vegan.add(new VeganMeal("Vegan Smoothie"));

        Meal<KetoMeal> keto=new Meal<>();
        keto.add(new KetoMeal("Keto Brownies"));
        keto.add(new KetoMeal("Keto Pancakes"));

        Meal<HighProteinMeal> highProtein=new Meal<>();
        highProtein.add(new HighProteinMeal("Paneer/Cottage Cheese"));
        highProtein.add(new HighProteinMeal("Lentils and Pulses"));
        vegetarian.displayMeals();
        System.out.println("---------------------------");
        vegan.displayMeals();
        System.out.println("---------------------------");
        keto.displayMeals();
        System.out.println("---------------------------");
        highProtein.displayMeals();
        System.out.println("---------------------------");
    }
}
