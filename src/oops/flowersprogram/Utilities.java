package oops.flowersprogram;

import java.util.*;
class BaseClass {
    public String rose="Rose";
    public String jasmine="Jasmine";
    public  String lily= "lily";
    int roseCost=1;
    int jasmineCost=2;
    int lilyCost=3;
    int totalCost=0;
    
    public int calculationOfFlowers(ArrayList<String> flower) {
        for(int i=0;i<flower.size();i++) {
            if(flower.get(i).equalsIgnoreCase(rose)) {
                totalCost=totalCost+roseCost;
        } else if (flower.get(i).equalsIgnoreCase(jasmine)) {
            totalCost=totalCost+jasmineCost;
        } else if(flower.get(i).equalsIgnoreCase(lily)) {
            totalCost=totalCost+lilyCost;
        } else {
            totalCost=+totalCost;
        }
    }
    return totalCost;
    
    
}
}

class Utilities extends BaseClass{
    public static ArrayList<String> flowersList = new ArrayList<>();
    
    public ArrayList<String> addFlowers(String flowersData) {
        String[] ar= flowersData.split("_");
        for(String flower:ar) {
        flowersList.add(flower);
        }
        return flowersList;
    }
    
    /*A bouquet consists of different types of flowers, Roses, Jasmines, 
    Lilys etc. Consider a rose costs 1$, jasmine costs 2$, Lily costs 3$. 
    The cost of the bouquet is the sum of the cost of the flowers in it.  
    Use the object-oriented approach to design the above situation and write a 
    utility method to calculate the cost of the given bouquet. */
    
    public static void main(String args[]) {
        Utilities utilities = new Utilities();
        ArrayList<String> flowersList=utilities.addFlowers("rose_lily");
        System.out.println("The Cost of Bouquet is "+" "+utilities.
        calculationOfFlowers(flowersList));
        }
}
