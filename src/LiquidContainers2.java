import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainerTwo first = new ContainerTwo();
        ContainerTwo second = new ContainerTwo();

        while (true) {

            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")){
                first.add(amount);

            }

            if (command.equals("remove")){
                    second.remove(amount);

            }

            if (command.equals("move")){
                first.remove(amount);
                second.add(amount);
            }




        }

    }
}


