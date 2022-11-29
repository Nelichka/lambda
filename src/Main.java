import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Leonardo", "da Vinci", 67));
        people.add(new Person("Lena", "Ivanova ", 10));
        people.add(new Person("Oleg", "De Du Van Lun", 28));
        people.add(new Person("Gena", "Mysin", 14));
        people.add(new Person("Sonya", "Ibn ali Hatabn", 90));

        Comparator<Person> comparator = (Person x, Person y) -> {
            int len1 = x.getSurname().split(" ").length;
            int len2 = y.getSurname().split(" ").length;
            int maxLen = 3;
            if (Math.min(len1, maxLen) != Math.min(len2, maxLen)) {
                return Integer.compare(len1, len2); // len1-len2
            }
            return Integer.compare(x.getAge(), y.getAge());
        };
        sortList(people, comparator);

    }

    public static <T> void sortList(List<T> list, Comparator<T> comparator) {
        list.sort(comparator);
        list.forEach(System.out::println);
        // ВЕТКА,  - ПОЧЕМУ ТЕБЯ НЕ ВИДНО?

    }
}



