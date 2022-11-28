import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Leonardo", "da Vinci", 67));
        people.add(new Person("Lena", "Ivanova ", 10));
        people.add(new Person("Oleg", "De Du Van Lun", 28));
        people.add(new Person("Gena", "Mysin", 14));
        people.add(new Person("Sonya", "Ibn ali Hatabn", 90));

        System.out.println(people);
        Collections.sort(people, new PersonComparator(3));// max кол-во слов в фамилии
        System.out.println(people);

    }
}