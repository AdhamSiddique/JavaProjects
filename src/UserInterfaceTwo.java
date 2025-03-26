import java.util.Scanner;

public class UserInterfaceTwo {


    private TodoList2 todoList;
    private Scanner scanner;

    public UserInterfaceTwo(TodoList2 todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
        System.out.print("Command:");
        String command = scanner.nextLine();

        if (command.contains("stop")){
            break;
        }

        if (command.contains("add")){
            System.out.print("To add:");
            String add = scanner.nextLine();
            todoList.add(add);

        }

        if (command.contains("list")){
            todoList.print();
        }

        if (command.contains("remove")){
            System.out.print("which one is removed");
            int lol = scanner.nextInt();
            todoList.remove(lol);

        }

        }




    }


}
