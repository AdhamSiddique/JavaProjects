import java.util.ArrayList;

    public class Stack {
        private ArrayList<String> stack;

        public Stack() {
            this.stack = new ArrayList<>();
        }

        public boolean isEmpty() {
            if (stack.isEmpty()) {
                return true;
            }
            return false;
        }

        public void add(String value) {
            stack.add(value);

        }


        public ArrayList<String> values() {
            return stack;

        }

        public String take() {
            int index = stack.size() - 1;  // index = 3 - 1 = 2
            String lastElement = stack.remove(index);  // Removes and returns the element at index 2
            return lastElement;
        }

        }








