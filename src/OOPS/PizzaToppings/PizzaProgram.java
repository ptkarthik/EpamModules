package OOPS.PizzaToppings;

import java.util.*;
class PizzaProgram {
    public static double basePrice=0.00;
    public static ArrayList<String> arrayListOftoppings= new ArrayList<String>();
    public static double toppingsPrice=0.00;
    public static double basePrice(String base) {
        if("Standard".equalsIgnoreCase(base)) {
            return basePrice+=10.00;
        } else {
            return basePrice+=15.00;
        }
        
    }
    public static double getTheBaseAndTheToppings(double basePrice, ArrayList<String> arrayListOftoppings) {
        for(int i=0;i<arrayListOftoppings.size();i++) {
            if(arrayListOftoppings.get(i).equalsIgnoreCase("Mushroom")) {
                toppingsPrice+=10.35;
            } else if(arrayListOftoppings.get(i).equalsIgnoreCase("Corn")) {
                toppingsPrice+=11.35;
            } else {
               toppingsPrice+=12.35;
            }
        }
        return basePrice+toppingsPrice;
    }
    public static void main(String[] args) {
        arrayListOftoppings.add("corn");
        System.out.println("The Total value of Pizza is "+" " +getTheBaseAndTheToppings(basePrice("Soft"),arrayListOftoppings));
    }
}
