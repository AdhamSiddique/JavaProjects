import java.util.Scanner;

public class Averageofpositivenumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give us a number lad we will get your average");
        int total = 0;
        int numberAdded = 0;

        while (true){
            int userInput = Integer.parseInt(input.nextLine());
            if (userInput <= 0){
                System.out.println("Cannot calculate the average");
            } else {
                total++;
                numberAdded += userInput;
                System.out.println((double)total % numberAdded);

            }


        }


    }


}
