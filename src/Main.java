import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ContainerTwo container = new ContainerTwo();
        System.out.println(container);
        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());
        container.remove(60);
        System.out.println(container);
        container.add(200);
        System.out.println(container);

        }

    }




















