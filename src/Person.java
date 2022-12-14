public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    //создали конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    //создали геттеры и сеттеры
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //создали toString
    @Override
    public String toString() {
        return name + " " + surname + "," + age;
    }

    @Override
    public int compareTo(Person p) {
        //return age - p.getAge();
        return Integer.compare(age, p.getAge());

    }
}

