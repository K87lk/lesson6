package user_comparable;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<User> set = new TreeSet<>();
        set.add(new User(25, "Alice", 160, 50));
        set.add(new User(30, "Bob", 180, 70));
        set.add(new User(20, "Charlie", 170, 60));
        set.add(new User(22, "Greg", 178, 80));
        set.add(new User(34, "Anne", 162, 53));
        set.add(new User(28, "Max", 190, 80));

        for (User user : set) {
            System.out.println(user);
        }
    }
}

