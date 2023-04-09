package Zadanie_4;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> steam_1 = collection.stream();
        Stream<Integer> steam_2 = collection.stream();
        Stream<Integer> steam_3 = collection.stream();

        double a = steam_1.filter(o -> o % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0);
        double sum = steam_2.reduce((s1, s2) -> s1 + s2).orElse(0);
        double b = steam_3.filter(o -> o % 2 == 0).reduce((s1, s2) -> s1 + s2).orElse(0);
        double rez_1 = sum/a;
        double rez_2 = sum/b;

        System.out.println("Сумма деленная на четные");
        System.out.println(rez_1);
        System.out.println("Сумма деленная на нечетные");
        System.out.println(rez_2);
    }
}