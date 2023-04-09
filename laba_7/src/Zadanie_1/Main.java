package Zadanie_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine()
                .replaceAll( "pa", "po")
                .replaceAll( "pA", "pO")
                .replaceAll( "Pa", "Po")
                .replaceAll( "PA", "PO");

        System.out.println("все А после Р замененына О");
        System.out.println(str);
    }
}