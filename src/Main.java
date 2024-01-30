import Book.Book;
import User.User;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      User user = new User("menso","Aa12345678",new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        Book AtomicHabits = new Book("Atomic Habits","Stoqn",1231,new ArrayList());
        Book JavaCrying = new Book("JAva","az",1232,new ArrayList());
        Book Necronomicon = new Book("Necronomicon","Lovecraft", 12321,new ArrayList());
        user.setRead(AtomicHabits);
        user.setRead(JavaCrying);
        user.setReading(Necronomicon);
        System.out.println(user.getListReading());
    }
}