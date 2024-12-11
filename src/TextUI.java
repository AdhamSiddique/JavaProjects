import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary wordSet;

    public TextUI(Scanner scanner, SimpleDictionary wordSet) {
        this.scanner = scanner;
        this.wordSet = wordSet;

    }

    public void start() {
        while (true) {
            System.out.print("Command:");
            String word = scanner.nextLine();

            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (word.equals("add")) {
                System.out.print("Word:");
                String wordT = scanner.nextLine();
                System.out.print("Translation:");
                String translateWord = scanner.nextLine();
                wordSet.add(wordT,translateWord);

            } else if (word.equals("search")) {
                System.out.print("To be translated:");
                String wordToTranslate = scanner.nextLine();
                String translation = wordSet.translate(wordToTranslate);
                if (translation != null){
                    System.out.println("Translation " + translation);
                } else {
                    System.out.println("Word " + wordToTranslate + " was not found");
                }
            } else {
                System.out.println("Unknown command");
            }

        }

    }
}


