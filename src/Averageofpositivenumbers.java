import java.util.Scanner;

public class Averageofpositivenumbers {

    public static void main(String[] args) {
        System.out.println("Average");
        Scanner input = new Scanner(System.in);

        int total = 0;
        int numberAdded = 0;

        while (true) {

            int userInput = input.nextInt();
            if (userInput > 0) {
                total++;
                numberAdded += userInput;
            }

             if (userInput <= 0){
                total++;
            }

             if (userInput == 0) {
                 System.out.println((double) numberAdded % total);
                 System.out.println(total);
                 System.out.println(numberAdded);
             }
            }


        }


    }


