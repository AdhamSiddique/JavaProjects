import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {

        int u = 1;
        for (String x : list) {
            System.out.println(u++ + ":" + x);
        }
    }

    public void remove(int number) {

        if (number > 0 && number <= list.size()) {
            list.remove(number - 1);
        } else {
            System.out.println("Invalid task number");
        }
    }

    }





