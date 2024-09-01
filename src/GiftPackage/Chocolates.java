package GiftPackage;

public class Chocolates implements ChocoSweetsInterface {
    private double chocolateWeight;
    private String chocolateName;

    public Chocolates(double chocolateWeight, String chocolateName) {
        this.chocolateWeight = chocolateWeight;
        this.chocolateName = chocolateName;
    }

    @Override
    public double calculateWeight() {
        return chocolateWeight;
    }

    @Override
    public String fetchGiftDetails() {
        return chocolateName;
    }
}

