package Zadanie_2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String str_old = console.nextLine();

        System.out.println("Введите длинну");
        int dl = 3;

        String change = "sosiski";

        String str_new = Arrays.stream(str_old.split(" "))
                .map(str -> str.length() == dl ? change : str)
                .collect(Collectors.joining(" "));

        System.out.println("Новая строка: ");
        System.out.println(str_new);
    }
}