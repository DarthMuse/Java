package Zadanie_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        String[] text_2 = str.split("\\.");

        String vowels = "оеаиуяыюэё";

        int cons = 0, vows = 0;

        for (int i = 0; i < text_2.length; i++) {
            for (char c : text_2[i].toCharArray()) {
                if (c == ' ') {
                    continue;         // пропустить пробелы
                }
                if (vowels.indexOf(c) != -1) {  // найдена гласная
                    vows++;
                } else { // иначе согласная
                    cons++;
                }
            }
            if (vows > cons){
                System.out.println("Гласных больше");
            }
            else {
                System.out.println("Согласных больше");
            }

        }
    }
}