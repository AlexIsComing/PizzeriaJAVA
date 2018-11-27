package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.setSize(PizzaSize.MEDIUM);
        pizza.addIngredient(new TomatoSauce());
        pizza.addIngredient(new Ham());
        pizza.addIngredient(new Cheese());
        pizza.addIngredient(new Olives());
        System.out.println("Price: " +pizza.getPrix_total());
        System.out.println("Ingredients" +pizza.getDescription());
    }
}
