
import java.util.HashMap;

public class Abbreviations {


    private HashMap<String, String> directory;



    public Abbreviations(){
    this.directory = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation,String explantaion){
    directory.put(abbreviation,explantaion);
    }

    public boolean hasAbbreviation(String abbrevation){
        return this.directory.containsKey(abbrevation);
    }

    public String findExplanationFor(String abbreviation){
       return this.directory.get(abbreviation);
    }









}
