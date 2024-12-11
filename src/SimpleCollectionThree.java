import java.util.ArrayList;

public class SimpleCollectionThree {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollectionThree(String name){
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add (String element){
        this.elements.add(element);
    }

    public ArrayList<String> getElements(){
        return this.elements;
    }

    public String longest(){
        if (this.elements.isEmpty()){
            return null;
        }

        String nameReturn = this.elements.get(0);

        for (String x: this.elements){
            if (nameReturn.length() < x.length()){
                nameReturn = x;
            }
        }
        return nameReturn;

    }
}
