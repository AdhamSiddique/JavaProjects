import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        List<String> bird = new ArrayList<>();
        List<String> observation = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Add - adds a bird");
            System.out.println("Observation - adds an observation");
            System.out.println("All - prints all birds");
            System.out.println("One - prints one bird");
            System.out.println("Quit - ends the program");

            System.out.print("?");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name:");
                String nameofBird = scanner.nextLine();
                System.out.print("Name in Latin:");
                String translationOfBird = scanner.nextLine();
                bird.add(nameofBird + "," + "(" + translationOfBird + "):");
            }

            if (command.equals("o")) {
                System.out.print("Bird?:");
                String observationBird = scanner.nextLine();
                boolean found = false;
                for (String names: bird){
                    String [] parts = names.split(",");
                    String namesOne = parts[0];
                    if (namesOne.equals(observationBird)) {
                        observation.add(observationBird);
                        found = true;
                    }
                }

                if (!found){
                    System.out.println("Cannot find bird");
                }


            }

            if (command.equals("All")) {
                for (String x : bird) {
                    String[] parts = x.split(",");
                    String names = parts[0];
                    String translation = parts[1];
                    int observationBirds = 0;

                    for (String obs : observation) {
                        if (obs.equals(names)) {
                            observationBirds++;
                        }
                    }
                    System.out.println(names + translation + observationBirds);

                }


            }

            if (command.equals("One")) {
                System.out.print("Bird?");
                String name = scanner.nextLine();
                for (String x : bird) {
                    String[] parts = x.split(",");
                    String names = parts[0];
                    String translation = parts[1];
                    int observationBirds = 0;
                    for (String obs : observation) {
                        if (obs.contains(names)) {
                            observationBirds++;
                        }
                    }
                    if (x.contains(name)) {
                        System.out.println(names + translation + observationBirds);
                    }
                }
            }

            if (command.equals("Quit")) {
                break;
            }
        }


    }
}



















