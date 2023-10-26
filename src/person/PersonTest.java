package person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alex", "Alexandrov", 23));
        persons.add(new Person("Max", "Maximov", 32));
        persons.add(new Person("Sergey", "Sergeev", 25));
        persons.add(new Person("Oleg", "Olegov", 28));
        persons.add(new Person("Petr", "Petrov", 19));
        persons.add(new Person("Ivan", "Ivanov", 20));
        persons.add(new Person("Gennady", "Genadiev", 36));
        persons.add(new Person("Gondon", "Zalupin", 42));

        Collections.sort(persons,
                Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getAge));

        System.out.println(persons);
    }
}
