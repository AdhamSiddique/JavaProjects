import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Cubes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
            int number = 0;

            String userInput = input.nextLine();

            number = Integer.parseInt(userInput);

            if (userInput.contains("end")){
               break;

            }

            System.out.println(number * number * number);
        }


    }

}
