package Zadanie_2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Степень многочлена: ");
        int st = console.nextInt();

        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        HashMap<Integer, Integer> hm3 = new HashMap<>();

        hm1.put(1, 10);
        hm1.put(2, 11);
        hm1.put(3, 13);
        hm1.put(4, 15);

        hm2.put(1, 10);
        hm2.put(2, 11);
        hm2.put(3, 13);
        hm2.put(4, 15);

        for (int i = 1; i <= st; i++) {
            hm3.put(i, hm1.get(i) + hm2.get(i));
        }
        System.out.println(hm3);
    }
}