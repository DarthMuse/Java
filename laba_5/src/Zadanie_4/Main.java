package Zadanie_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Abiturient[] abiturients = new Abiturient[100];

        Scanner console = new Scanner(System.in);

        String first_name;
        String second_name;
        String third_name;
        String address;
        int[] ocenki = new int[100];

        System.out.println("Сколько будет аббитуриентов: ");
        int col = console.nextInt();
        for (int i = 0; i < col; i++) {
            System.out.println("Введите имя: ");
            first_name = console.next();
            if(!console.hasNextInt()){
                if (first_name.length() > 50){
                    System.out.println("Слишком длинное имя, повторите ввод");
                    first_name = console.next();
                }
            } else {
                System.out.println("Введено число, введите заново");
                first_name = console.next();
            }
            System.out.println("Введите фамилию: ");
            second_name = console.next();
            if(!console.hasNextInt()){
                if (second_name.length() > 50){
                    System.out.println("Слишком длинное имя, повторите ввод");
                    second_name = console.next();
                }
            } else {
                System.out.println("Введено число, введите заново");
                second_name = console.next();
            }
            System.out.println("Введите отчество: ");
            third_name = console.next();
            if(!console.hasNextInt()){
                if (third_name.length() > 50){
                    System.out.println("Слишком длинное имя, повторите ввод");
                    third_name = console.next();
                }
            } else {
                System.out.println("Введено число, введите заново");
                third_name = console.next();
            }
            System.out.println("Введите адрес: ");
            address = console.next();
            if(!console.hasNextInt()){
                if (third_name.length() > 50){
                    System.out.println("Слишком длинное имя, повторите ввод");
                    third_name = console.next();
                }
            } else {
                System.out.println("Введено число, введите заново");
                third_name = console.next();
            }
            System.out.println("Сколько оценок: ");
            int kol_oc = console.nextInt();
            for (int j = 0; j < kol_oc; j++) {
                ocenki[i] = console.nextInt();
            }
            abiturients[i] = new Abiturient(i, first_name, second_name,
                    third_name, address, i, ocenki);
        }

        for(int i = 0; i < col; i++){
            for (int j = 0; j < abiturients[i].getOcenki().length; j++) {
                if (abiturients[i].getOcenki().length == 2){
                    System.out.println(abiturients[i].getFirst_name() + " " + abiturients[i].getSecond_name());
                    break;
                }
            }
        }

        System.out.println("Средний балл: ");
        int z_sr_ball = console.nextInt();
        if (z_sr_ball == (int)z_sr_ball){
        }else {
            System.out.println("Введено число, повторный ввод");
            z_sr_ball = console.nextInt();
        }
        double sr_ball = 0;
        int[] mass_ocenki;

        for(int i = 0; i < col; i++){
            mass_ocenki = abiturients[i].getOcenki();
            for (int j = 0; j < abiturients[i].getOcenki().length; j++) {
                sr_ball += mass_ocenki[i];
            }
            sr_ball /= abiturients[i].getOcenki().length;
            if (sr_ball < z_sr_ball){
                System.out.println(abiturients[i].getFirst_name() + " " + abiturients[i].getSecond_name());
            }
            sr_ball = 0;
        }

        System.out.println("Высокий балл: ");
        int viss_ball = console.nextInt();
        if (viss_ball == (int)viss_ball){
        }else {
            System.out.println("Введено число, повторный ввод");
            viss_ball = console.nextInt();
        }
        for (int i = 0; i < col; i++) {
            mass_ocenki = abiturients[i].getOcenki();
            for (int j = 0; j < abiturients[i].getOcenki().length; j++) {
                sr_ball += mass_ocenki[i];
            }
            sr_ball /= abiturients[i].getOcenki().length;
            if (sr_ball > viss_ball){
                System.out.println(abiturients[i].getFirst_name() + " " + abiturients[i].getSecond_name());
            }
            sr_ball = 0;
        }

        System.out.println("Проходной балл: ");
        double pr_ball = console.nextInt();
        if (pr_ball == (double)pr_ball){
        }else {
            System.out.println("Введено число, повторный ввод");
            pr_ball = console.nextInt();
        }
        System.out.println("Имеют полупроходной балл: ");
        for (int i = 0; i < col; i++) {
            mass_ocenki = abiturients[i].getOcenki();
            for (int j = 0; j < abiturients[i].getOcenki().length; j++) {
                sr_ball += mass_ocenki[i];
            }
            sr_ball /= abiturients[i].getOcenki().length;
            if (sr_ball > pr_ball/2){
                System.out.println(abiturients[i].getFirst_name() + " " + abiturients[i].getSecond_name());
            }
            sr_ball = 0;
        }
    }
}