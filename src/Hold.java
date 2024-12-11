import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> items;
    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addSuitcase (Suitcase suitcase){

        int totalSuitcases = 0;
        for (Suitcase x: items) {
            totalSuitcases += x.totalWeight();
        }
            if (totalSuitcases + suitcase.totalWeight() <= this.maximumWeight){
                this.items.add(suitcase);
            }
        }

        public void printItems(){
        for (Suitcase x: items){
            x.printItems();
        }
        }



    public String toString (){
        int totalWeight = 0;
        for (Suitcase item : items) {
            totalWeight += item.totalWeight();
        }
        return items.size() + " suitcases (" + totalWeight + " kg)";
}
}