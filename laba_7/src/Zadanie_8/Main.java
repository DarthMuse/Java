package Zadanie_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String[] text2 =  text.split("\\s+");

        ArrayList<String> arr_text = new ArrayList<>();
        for (int i = 0; i < text2.length; i++) {
            arr_text.add(text2[i]);
        }

        System.out.println("Введите слово 1: ");
        String slovo_1 = console.nextLine();
        System.out.println("Введите слово 2: ");
        String slovo_2 = console.nextLine();

        int sl_1 = 0;
        int sl_2 = 0;
        for (int i = 0; i < text2.length; i++) {
            if(slovo_1.equals(text2[i])){
                sl_1 = i;
            }
            if(slovo_2.equals(text2[i])){
                sl_2 = i;
            }
        }

        for (int i = sl_1; i < sl_2; i++) {
            arr_text.remove(i);
        }
        arr_text.remove(sl_1 + 1);

        System.out.println(arr_text.toString().replace("[", "").
                replace("]", "").replaceAll(",", ""));
    }
}