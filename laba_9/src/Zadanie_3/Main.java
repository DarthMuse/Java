package Zadanie_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> steam = collection.stream();

        int a = steam.filter(o -> o % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0);

        System.out.println(a);
    }
}