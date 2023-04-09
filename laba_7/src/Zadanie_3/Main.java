package Zadanie_3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        HashSet<String> povtor = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            povtor.add(String.valueOf(str.charAt(i)));
        }

        ArrayList<String> arr = new ArrayList<>();
        Iterator<String> in = povtor.iterator();
        while (in.hasNext())
            arr.add(in.next());

        HashMap<Integer, String> mass = new HashMap<>();

        for (int i = 0; i < povtor.size(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                String ch = String.valueOf(str.charAt(j));
                if (ch.equals(arr.get(i))) {
                    count++;
                }
            }
            mass.put(count, arr.get(i));
        }

        for ( Integer key : mass.keySet() ) {
            if (key > 10){
                System.out.println("Количество: " + key + ", Символ: " + mass.get(key));
            }
        }
    }
}