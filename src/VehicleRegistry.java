import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> lol = new HashMap<>();

    public VehicleRegistry() {

    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (lol.containsValue(owner)) {
            return false;
        } else {
            lol.put(licensePlate, owner);
        }
        return false;

    }

    public String get(LicensePlate licensePlate) {
        return lol.getOrDefault(licensePlate,null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (lol.containsKey(licensePlate)) {
            this.lol.remove(licensePlate);
            return true;
        }

        return false;

    }

    public void printLicensePlates(){

        for (LicensePlate x: lol.keySet()){
            System.out.println(x);
        }
    }

    public void printOwners(){
        for (String x: lol.values()){
            System.out.println(x.length());
        }
    }
}


