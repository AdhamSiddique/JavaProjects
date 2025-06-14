package flightcontrol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import flightcontrol.domain.Planes;


public class Main {
    public static void main(String[] args) {

        HashMap<String, String> airPlane = new HashMap<>();
        ArrayList<String> flight = new ArrayList<>();

        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            String command = userInput.nextLine();

            if (command.matches("1")) {
                System.out.print("Give the airplane id:");
                String commandTwo = userInput.nextLine();
                System.out.print("Give the airplane capacity:");
                int commandThree = Integer.parseInt(userInput.nextLine());
                airPlane.put(commandTwo, String.valueOf(Integer.parseInt(String.valueOf(commandThree))));
            }

            if (command.matches("2")) {
                System.out.print("Give the airplane id: ");
                String choosePlane = userInput.nextLine();

                if (!airPlane.containsKey(choosePlane)) {
                    System.out.println("Plane not found!");
                    continue;
                }

                System.out.print("Give the departure airport id: ");
                String depart = userInput.nextLine();

                System.out.print("Give the target airport id: ");
                String target = userInput.nextLine();

                flight.add(choosePlane + " (" + airPlane.get(choosePlane) + " capacity) (" + depart + "-" + target + ")");
            }


            if (command.matches("x")) {
                break;
            }

        }

        while (true) {
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flight");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            String command = userInput.nextLine();

            if (command.matches("1")) {
                for (String key : airPlane.keySet()) {
                    System.out.println(key + "(" + airPlane.get(key) + " " + "capacity" + ")");
                }
            }

            if (command.matches("2")) {
                for (String f : flight) {
                    System.out.println(f);
                }
            }

            if (command.matches("3")) {
                System.out.println("Give the airplane id");
                String input = userInput.nextLine();
                if (airPlane.containsKey(input)) {
                    System.out.println(input + " (" + airPlane.get(input) + " capacity)");
                }

            }

                if (command.matches("x")){
                    break;
                }
            }
        }
    }

