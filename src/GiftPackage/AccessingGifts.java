package GiftPackage;

import java.util.ArrayList;
import java.util.List;

public class AccessingGifts {
    public double totalWeight;
    public String itemName;

    public double selectGifts(List<ChocoSweetsInterface> list) {
        for (ChocoSweetsInterface chocoSweetsInterface : list) {
            totalWeight = totalWeight + chocoSweetsInterface.calculateWeight();
        }
        return totalWeight;
    }

    public String selectionOfGifts(double totalWeight) {
        String giftDetails = "";
        if (totalWeight >0 && totalWeight<4.99) {
            giftDetails = "you have a goodies gift card worth 1 rs";
            return giftDetails;
        } else if (totalWeight > 5.00 && totalWeight < 10.00) {
            giftDetails = "you have a goodies gift card worth 2 rs";
            return giftDetails;
        }  else if (totalWeight > 10.00 && totalWeight < 20.00) {
            giftDetails = "you have 2 Lux Soaps Free";
            return giftDetails;
        } else if (totalWeight > 50.00 && totalWeight < 100.00) {
            giftDetails = "you have 1 KG Rice and Toys worth 20 rs for Free";
            return giftDetails;
        } else if (totalWeight > 100.00 && totalWeight < 300.00) {
            giftDetails = "you have a remote Rc car for free";
            return giftDetails;
        } else {
            return "Poitns have been added and you will get the data next time";
        }
    }

    public List<ChocoSweetsInterface> listOfObjects = new ArrayList<>();

    public static void main(String args[]) {
        AccessingGifts accessingGifts = new AccessingGifts();
        ChocoSweetsInterface jamun = new Sweets(10, SweetsAndChocalates.JAMUN.name());
        accessingGifts.listOfObjects.add(jamun);
        ChocoSweetsInterface baadusha = new Sweets(0.5, SweetsAndChocalates.BAADUSHA.name());
        accessingGifts.listOfObjects.add(baadusha);
        ChocoSweetsInterface jilebi = new Sweets(40, SweetsAndChocalates.JILEBI.name());
        accessingGifts.listOfObjects.add(jilebi);
        ChocoSweetsInterface mysorePak = new Sweets(15, SweetsAndChocalates.MYSOREPAK.name());
        accessingGifts.listOfObjects.add(mysorePak);
        ChocoSweetsInterface dairyMilk = new Chocolates(5, SweetsAndChocalates.DAIRYMILK.name());
        accessingGifts.listOfObjects.add(dairyMilk);
        ChocoSweetsInterface fiveStar = new Chocolates(20, SweetsAndChocalates.FIVESTAR.name());
        accessingGifts.listOfObjects.add(fiveStar);

        double totalWeight = accessingGifts.selectGifts(accessingGifts.listOfObjects);
        System.out.println("Total Weight of all the Purchased Items is"+ " "+totalWeight);
        System.out.println("The gift voucher details as below " + "\n" +
                "******"+" "+accessingGifts.selectionOfGifts(totalWeight)+" "+"*****");
    }
}
