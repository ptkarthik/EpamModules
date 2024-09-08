package oops.PizzaToppings;

import java.util.ArrayList;

class PizzaProgram {
    public static double basePrice = 0.00;
    public static ArrayList<String> arrayListOfToppings = new ArrayList<String>();
    public static double toppingsPrice = 0.00;

    public static double basePrice(String base) {
        if ("Standard".equalsIgnoreCase(base)) {
            return basePrice += 10.00;
        } else {
            return basePrice += 15.00;
        }

    }

    public static double getTheBaseAndTheToppings(double basePrice, ArrayList<String> arrayListOfToppings) {
        for (int i = 0; i < arrayListOfToppings.size(); i++) {
            if (arrayListOfToppings.get(i).equalsIgnoreCase("Mushroom")) {
                toppingsPrice += 10.35;
            } else if (arrayListOfToppings.get(i).equalsIgnoreCase("Corn")) {
                toppingsPrice += 11.35;
            } else if (arrayListOfToppings.get(i).equalsIgnoreCase("Tomato")) {
                toppingsPrice += 11.35;
            } else {
                toppingsPrice += 0;
            }
        }
        return basePrice + toppingsPrice;
    }

    public static void main(String[] args) {
        arrayListOfToppings.add("corn");
        arrayListOfToppings.add("Mushroom");
        arrayListOfToppings.add("Tomato");
        System.out.println("The Total value of Pizza is " + " " +
                getTheBaseAndTheToppings(basePrice("Standard"), arrayListOfToppings));
    }
}
