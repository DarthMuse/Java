package Zadanie_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("не Введите строку: ");

        ArrayList<String> text = new ArrayList<>();
        text.add("тт      mm                       тирн?");
        text.add("тирн n тт.");
        text.add("тирн тирн тт?");

        System.out.println("Введите длинну: ");
        Scanner console = new Scanner(System.in);
        int dl = console.nextInt();

        for (int i = 0; i < text.size(); i++) {
            String[] text_text = text.get(i).split("\\s+");
            if(text_text[text_text.length - 1].endsWith("?")){
                text_text[text_text.length - 1] = text_text[text_text.length - 1].replace("?", "");
                for (int j = 0; j < text_text.length; j++) {
                    if(text_text[j].length() == dl){
                        System.out.println(text_text[j]);
                    }
                }
            }
        }

    }
}