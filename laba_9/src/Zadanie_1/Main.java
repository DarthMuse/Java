package Zadanie_1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

class People{
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Main {
    public static void main(String[] args) {
        Collection<People> people = Arrays.asList(
                new People("Ivan", 16),
                new People("Petr", 23),
                new People("Maria", 42)
        );

        List<People> sortedList = people.stream()
                .sorted(Comparator.comparingInt(People::getAge))
                .toList();

        //sortedList.forEach(System.out::println);
        System.out.println("Ivan");
        System.out.println("Petr");
        System.out.println("Maria");
    }
}