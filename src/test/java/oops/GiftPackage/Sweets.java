package oops.GiftPackage;

/*As part of assessing your programming skills,
can you design a Java program to manage a New Year's gift with various chocolates and sweets?
The program should establish a hierarchy for these confectioneries, 
create objects representing different sweets,calculate the total weight of a children's gift,
implement a sorting mechanism for the chocolates based on a user-selected option,
and identify candies within the gift that fall within a
specified range of options. Please provide the code for each step and explain your design choices. */

public class Sweets implements ChocoSweetsInterface {
    private double sweetWeight;
    private String sweetName;

    public Sweets(double sweetWeight, String sweetName) {
        this.sweetWeight = sweetWeight;
        this.sweetName = sweetName;
    }

    @Override
    public double calculateWeight() {
        return sweetWeight;
    }

    @Override
    public String fetchGiftDetails() {
        return sweetName;
    }
}






