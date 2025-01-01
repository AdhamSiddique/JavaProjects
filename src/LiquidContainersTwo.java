import java.util.Scanner;

public class LiquidContainersTwo {

    public static void main(String[] args) {

        int first = 0;
        int second = 0;

        Scanner userInputTwo = new Scanner(System.in);

        while (true){
            System.out.println("List of commands");
            System.out.println("add");
            System.out.println("move");
            System.out.println("remove");

            String input = userInputTwo.nextLine();

            if (input.equals("quit")){
                break;
            }

            if (input.equals("add")){
                System.out.println("add?");
                int userInput = userInputTwo.nextInt();
                if ((userInput >= 0) && (userInput <= 100)){
                    first += userInput;
                }

            }

        }

        System.out.println(first);



    }
}
