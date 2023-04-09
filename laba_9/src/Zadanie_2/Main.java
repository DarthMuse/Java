package Zadanie_2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("pel=0", "me=1", "ni=2");
        Stream<String> steam = collection.stream();

        Map<String, String> result = steam
                .map( e -> e.split("=") )
                .filter( e -> e.length == 2 )
                .collect( Collectors.toMap(e -> e[0], e -> e[1]) );

        result.entrySet().stream().forEach(System.out::println);
    }
}