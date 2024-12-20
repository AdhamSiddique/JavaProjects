import java.util.Scanner;

public class Averageofpositivenumbers {

    public static void main(String[] args) {
        System.out.println("Average");
        Scanner input = new Scanner(System.in);

        int total = 0;
        int positiveNumberAdded = 0;

        while (true) {
            int userInput = input.nextInt();
            if (userInput > 0) {
                total++;
                positiveNumberAdded += userInput;
            }

            if (userInput == 0){
                System.out.println((double) positiveNumberAdded / total);
            } else {
                System.out.println("Cannot calculate average");
            }
        }



    }


    }


