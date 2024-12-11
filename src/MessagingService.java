import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> msgService;


    public void add(Message message) {
        this.msgService = new ArrayList<>();
        if (message.getContent().length() <= 280) {
            this.msgService.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.msgService;
    }

}
