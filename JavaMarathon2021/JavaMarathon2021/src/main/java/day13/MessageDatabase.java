package day13;


import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }


    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message dialog : messages) {
            if (dialog.getSender() == u1 && dialog.getReceiver() == u2 ||
                    dialog.getSender() == u2 && dialog.getReceiver() == u1) {
                if(dialog.getSender() == u1){
                    System.out.println(u1.getUserName() + ": "+ dialog.getText());
                }else{
                    System.out.println(u2.getUserName() + ": "+ dialog.getText());
                }
            }
        }
    }
}
