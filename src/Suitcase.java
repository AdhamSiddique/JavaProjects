import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        // Calculate total weight directly in the if statement
        int currentWeight = 0;
        for (Item existingItem : items) {
            currentWeight += existingItem.getWeight();
        }
        if (currentWeight + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item x: items){
            System.out.println(x.getName() + " " + "(" + x.getWeight() + " " + "kg" + ")");
        }


    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Item k: items){
            totalWeight += k.getWeight();
        }
        return totalWeight;


    }

    public Item heaviestItem(){
    if (items.isEmpty()){
        return null;

    }

    Item returnObject = this.items.get(0);

    for (Item item: this.items){
        if (item.getWeight() > returnObject.getWeight()){
            returnObject = item;

        }
    }
    return returnObject;

    }


    @Override
    public String toString() {
        // Calculate total weight directly in the toString method

        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        if (items.size() == 0) {
            return "no items (" + totalWeight + " kg)";
        }

        if (items.size() == 1){
            return items.size() + " item (" + totalWeight + " kg)";
        }

        return items.size() + " items (" + totalWeight + " kg)";
    }
}
