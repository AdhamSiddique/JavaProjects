import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> sum;
    public IOU(){
        this.sum = new HashMap<>();
    }


    public void setSum (String toWHom,double amount){
        sum.put(toWHom,amount);

    }

    public double howMuchDoIOweTo(String toWhom){
       return sum.getOrDefault(toWhom,0.0);
    }

}
