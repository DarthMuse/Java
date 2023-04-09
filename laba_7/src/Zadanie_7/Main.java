package Zadanie_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class pair
{
    int first;
    String second;

    pair(int first,String second)
    {
        this.first = first;
        this.second = second;
    }
}
public class Main {
    //функция поиска гласной
    static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' ||
                ch == 'I' || ch == 'O' ||
                ch == 'U');
    }
    //количество гласных
    static int countVowels(String str)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
            //наличие гласных
            if (isVowel(str.charAt(i)))
                ++count;

        return count;
    }
    public static void main(String[] args) {

        System.out.println("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String[] text2 =  text.split("\\s+");
        Arrays.sort(text2);

        int n = text2.length;
        //Вектор для хранения количества гласных
        // с соответствующими словами
        ArrayList<pair> vp = new ArrayList<>();
        // Вставка количества гласных с соответствующими
        // строками в векторной паре
        for(int i = 0; i < n; i++)
        {
            vp.add(new pair(countVowels(text2[i]),
                    text2[i]));
        }

        //сортировка
        Collections.sort(vp, (a, b) -> a.first - b.first);
        for(int i = 0; i < vp.size(); i++)
            System.out.print(vp.get(i).second + " ");

        Arrays.sort(text2);

    }
}