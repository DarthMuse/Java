package Zadanie_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("не Введите строку: ");

        ArrayList<String> text = new ArrayList<>();
        text.add("тт                             тирн  mm.");
        text.add("тирн n  mm   тт.");
        text.add("тирн тирн тт.");

        String[] text1 = text.get(0).split("\\s+");
        if(text1[text1.length - 1].endsWith(".")) {
            text1[text1.length - 1] = text1[text1.length - 1].replace(".", "");
        }

        String sl = "";
        String finali = "";
        boolean check = true;

        for (int k = 1; k < text.size(); k++) {
            String[] text_2_3 = text.get(k).split("\\s+");
            if(text_2_3[text_2_3.length - 1].endsWith(".")) {
                text_2_3[text_2_3.length - 1] = text_2_3[text_2_3.length - 1].replace(".", "");
            }
            for (int i = 0; i < text1.length; i++) {
                for (int j = 0; j < text_2_3.length; j++) {
                    sl = text1[i];
                    if (text1[i].equals(text_2_3[j]) && check){
                        check = false;
                        sl = "";
                        break;
                    }
                }
                if (check){
                    finali = sl;
                }
                check = true;
            }
        }

        System.out.println(finali);
    }
}