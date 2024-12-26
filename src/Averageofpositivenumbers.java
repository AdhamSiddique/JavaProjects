import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Averageofpositivenumbers {
    public static void main(String[] args) {

        System.out.println("Average");
        Scanner input = new Scanner(System.in);

        double total = 0;
        double positiveNumberAdded = 0;
        while (true) {
           int userInput = input.nextInt();
            if (userInput > 0) {
                total++;
                positiveNumberAdded += userInput;
            }

            if (userInput == 0){
                break;
            }

        }

        if (total == 0){
            System.out.println("Cannot calculate average");
        } else {
            double result = positiveNumberAdded / total;
            System.out.println(result);
        }


    }


}




        //double result = positiveNumberAdded / total;
        //System.out.println("Cannot calculate average");








