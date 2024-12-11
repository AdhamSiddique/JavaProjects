import java.util.ArrayList;

public class Package {

    ArrayList<Gift> gifts = new ArrayList<>();

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        if (gifts.isEmpty()){
            return 0;
        }

        int totatWeight = 0;
        for (Gift weight: gifts){
            totatWeight += weight.getWeight();
        }

        return totatWeight;

    }
}
