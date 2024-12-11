import java.util.ArrayList;
import java.util.Scanner;
public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;

        while (true) {

            System.out.println("First: " + firstVolume + "/" + maxVolume);
            System.out.println("Second: " + secondVolume + "/" + maxVolume);

            String input = scan.nextLine();


            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    firstVolume += amount;
                    if (firstVolume > 100) {
                        firstVolume = 100;
                    }
                }
            }

            if (command.equals("remove")) {
                if (amount < 0) {
                    secondVolume -= amount;

                    if (secondVolume < 0) {
                        secondVolume = 0;
                    }
                }
            }

                if (command.equals("move")) {
                    if (command.equals("move")) {
                        if (amount > 0) {
                            firstVolume -= amount;
                        }
                        if (amount > 0) {
                            secondVolume += amount;
                        }
                    }

                    if (secondVolume > 100) {
                        secondVolume = 100;
                    }
                }


            }


        }
    }



