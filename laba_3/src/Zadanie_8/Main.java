package Zadanie_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        abiturient[] abiturients = new abiturient[100];
        facultet[] facultets = new facultet[10];
        Prepodovatel[] prepodovatels = new Prepodovatel[40];

        System.out.println("Сколько будет аббитуриентов: ");
        int col1 = console.nextInt();
        for (int i = 0; i < col1; i++) {
            System.out.println("Введите имя: ");
            String first_name = console.next();
            System.out.println("Введите фамилию: ");
            String second_name = console.next();
            System.out.println("Введите отчество: ");
            String third_name = console.next();
            abiturients[i] = new abiturient(i, first_name, second_name, third_name);
        }

        System.out.println("Сколько будет учителей: ");
        int col2 = console.nextInt();
        for (int i = 0; i < col2; i++) {
            String first_name = console.next();
            String second_name = console.next();
            String third_name = console.next();
            prepodovatels[i] = new Prepodovatel(i, first_name, second_name, third_name);
        }

        System.out.println("с каким аббитуриентом работать?");
        int id_abb = console.nextInt();
        System.out.println("на какой факультет поступает?");
        int fak = console.nextInt();
        abiturients[id_abb].setFak(fak);

        int n = 0;
        System.out.println("с каким преподавателем работать?");
        int id_pr = console.nextInt();
        if(abiturients[id_abb].ekz()){
            facultets[abiturients[id_abb].fak].sr += prepodovatels[id_pr].ocenka();
            abiturients[id_abb].setOcenka(prepodovatels[id_pr].ocenka());
            n++;
            facultets[abiturients[id_abb].fak].setN(n);
        }

        System.out.println("Средний бал какого факультета?");
        int num_fak = console.nextInt();
        System.out.println(facultets[num_fak].pr_ball());
        if (abiturients[id_abb].getOcenka() > facultets[num_fak].pr_ball()){
            System.out.println("аббитуриент прошел");
        } else {
            System.out.println("аббитуриент не прошел");
        }
    }
}