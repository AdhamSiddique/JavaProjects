import java.util.ArrayList;

public class ContainerTwo {

    private int amount;
    int maximum = 100;
    ArrayList<Integer> firstContainer = new ArrayList<>();
    ArrayList <Integer> secondContainer = new ArrayList<>();
    public int contains() {
        return this.amount;
    }

    public void add (int amount){
        if (amount > 0) {
            this.amount += amount;
        }

        if (this.amount > 100){
            this.amount = 100;
        }

    }

    public void remove (int amount){
    if (amount > 0){
        this.amount -= amount;
    }

    if (this.amount < 0){
        this.amount = 0;
    }

    }

    public String toString(){
        return  this.amount + "/" + this.maximum;
    }

}
