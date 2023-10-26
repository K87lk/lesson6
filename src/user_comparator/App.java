package user_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<AnotherUser> set = new TreeSet<>(
                Comparator.comparingInt(AnotherUser::getHeight)
                        .thenComparing(AnotherUser::getWeight)
                        .thenComparing(AnotherUser::getName));

        set.add(new AnotherUser(25, "Alice", 160, 50));
        set.add(new AnotherUser(30, "Bob", 180, 70));
        set.add(new AnotherUser(20, "Charlie", 170, 60));
        set.add(new AnotherUser(22, "Greg", 178, 80));
        set.add(new AnotherUser(34, "Anne", 162, 53));
        set.add(new AnotherUser(28, "Max", 190, 80));

        for (AnotherUser user : set) {
            System.out.println(user);
        }
    }
}
