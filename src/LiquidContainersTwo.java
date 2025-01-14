import java.util.Scanner;

public class LiquidContainersTwo {

    public static void main(String[] args) {

        int first = 0;
        int second = 0;

        Scanner userInputTwo = new Scanner(System.in);

        while (true) {
            System.out.println("First:" + first + "/100");
            System.out.println("Second:" + second + "/100");

            String userInput = userInputTwo.nextLine();
            String[] parts = userInput.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            if (command.contains("add")) {

                if (first + amount > 100) {
                    first = 100;
                } else if (amount > 0) {
                    first += amount;
                }


            }

            if (command.contains("quit")) {
                break;
            }


            if (command.contains("move")) {
                if (amount < 0){
                continue;
                }

                if (first > 0) {
                    first -= amount;
                    second += amount;
                }




            }


            if (second > 100) {
                second = 100;
            }

            if (command.contains("remove")) {

                if (amount > second) {
                    second -= amount;
                }
            }


        }


    }
}


