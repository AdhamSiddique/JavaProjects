public class Gift {

    private String name;

    private int weight;

    public Gift (String nameOfBook,int weight){
        this.name = nameOfBook;
        this.weight = weight;
    }

    public String getName (){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public String toString(){
        return this.name + " " + "(" + this.weight + " " + "kg" + ")";
    }
}
