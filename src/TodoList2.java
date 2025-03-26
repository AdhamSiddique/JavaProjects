import java.util.ArrayList;

public class TodoList2 {

    public ArrayList<String> list = new ArrayList<>();

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        for (int x = 0; x < list.size(); x++) {
            System.out.println(x + 1 + ":" + " " + list.get(x));
        }

        }

    public void remove(int number) {
        list.remove(number - 1);
    }
}


