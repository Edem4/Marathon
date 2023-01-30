package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");

        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "Hi, user1!");
        MessageDatabase.showDialog(user1, user2);
    }
}
