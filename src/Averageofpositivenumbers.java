import java.util.ArrayList;
import java.util.Scanner;

public class Averageofpositivenumbers {

    public static void main(String[] args) {
        System.out.println("Average");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        double total = 0;
        double positiveNumberAdded = 0;

        while (true) {
            int userInput = input.nextInt();
            if (userInput > 0) {
                total++;
                positiveNumberAdded += userInput;
            } else if (userInput == 0) {
                break;
            }



        }

        double result = positiveNumberAdded / total;
        System.out.println(result);


    }



        }



