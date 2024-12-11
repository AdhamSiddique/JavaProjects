import java.util.Scanner;

public class UserInterface {

    private JokeManager register;
    private Scanner scanner;

    public UserInterface(JokeManager register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
           System.out.println("Commands:");
           System.out.println("1 - add a joke");
           System.out.println("2 - draw a joke");
           System.out.println("3 - list jokes");
           System.out.println("X - stop");
           String command =  scanner.nextLine();

           if (command.equals("X")) {
               break;
           } else if (command.equals("1")) {
               System.out.println("Write the joke to be added: ");
               String add = scanner.nextLine();
               register.addJoke(add);
           } else if (command.equals("3")) {
               System.out.println("Printing the jokes");
               register.printJokes();
           } else if (command.equals("2")) {
                String x = register.drawJoke();
               System.out.println(x);
           }
       }

    }

}
