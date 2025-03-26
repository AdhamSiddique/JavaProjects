import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
            public static void main(String[] args) {

                VehicleRegistry registry = new VehicleRegistry(); // Creating an object

                LicensePlate plate1 = new LicensePlate("UK", "ABC-123");
                LicensePlate plate2 = new LicensePlate("UK", "XYZ-789");

                registry.add(plate1, "John Doe");
                registry.add(plate2, "Jane Doe");
                System.out.println(registry.get(plate1)); // Output: John Doe
                System.out.println(registry.get(plate2)); // Output: Jane Doe
                System.out.println(registry.remove(plate1));
                System.out.println(registry.remove(plate1));
                System.out.println(registry.get(plate1));
                registry.printLicensePlates();


            }
        }























