package Zadanie_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Pacient pacients1 = new Pacient( "Роман", "Тетраков",
                "Таблеткович", 1, "Шиза", 1, false, false);
        lech_vrach lechVrach1 = new lech_vrach (1, "Роман", "Тетраков",
                "Таблеткович", "от шизи", "пить таблетки");
        med_sister medSister1 = new med_sister("Мария", "Кариева",
                "Оранжевна", "Тетраков");

        Pacient[] pacients = new Pacient[100];
        lech_vrach[] lechVrach = new lech_vrach[100];
        med_sister[] medSister = new med_sister[100];

        int id_cart = 2;
        int id_vrach = 2;
        int id_vracha = 0;
        int id_pacienta = 0;
        int id_sister = 0;

        System.out.println("С кем будет работа?");
        System.out.println("1 - пациент");
        System.out.println("2 - врач");
        System.out.println("3 - медсестра");
        int work = console.nextInt();
        if(work == 1){
            System.out.println("Пациент");

            System.out.println("добавить пациента?");
            String otv = console.next();
            if(otv.equals("да")){
                String first_name = console.next();
                String second_name = console.next();
                String third_name = console.next();
                String lechnie = console.next();
                int vrach = console.nextInt();
                id_cart++;
                pacients[id_pacienta] = new Pacient(first_name, second_name, third_name, id_cart,
                        lechnie, vrach, false, false);
                id_pacienta++;
            }

            System.out.println("с каким пациоентом рабоать?");
            int id_cart_pac = console.nextInt();

            System.out.println("Назначить врача?");
            String da = console.next();
            if(da.equals("да")){
                pacients[id_cart_pac].setLech_vrach_naz(lechVrach[id_vracha].getId());
            }

            if(pacients[id_cart_pac].getEnd_lech() || pacients[id_cart_pac].getNarush()){
                System.out.println("пациента выписан");
                System.out.println("Причина");
                if(pacients[id_cart_pac].getEnd_lech()){
                    System.out.println("Закончено лечение");
                } else {
                    System.out.println("Буянит");
                }
            }
        } else if (work == 2) {
            System.out.println("Врач");

            System.out.println("добавить врача?");
            String otv = console.next();
            if(otv.equals("да")){
                String first_name = console.next();
                String second_name = console.next();
                String third_name = console.next();
                String spec = console.next();
                String lechnie = console.next();
                id_vrach++;
                lechVrach[id_vracha] = new lech_vrach(id_vrach, first_name, second_name, third_name, spec, lechnie);
                id_vracha++;
            }

            System.out.println("с каким врачом рабоать?");
            int id_vrach_work = console.nextInt();
            System.out.println("какому пациенту назначать?");
            int id_cart_pac = console.nextInt();

            System.out.println("Назначить процедуры?");
            String da = console.next();
            if(da.equals("да")){
                pacients[id_cart_pac].setProc(lechVrach[id_vrach_work].procedur());
            } else {
                System.out.println("Назначить лекарство?");
                da = console.next();
                if(da.equals("да")){
                    pacients[id_cart_pac].setProc(lechVrach[id_vrach_work].new_lech());
                } else {
                    System.out.println("Назначить операцию?");
                    da = console.next();
                    if(da.equals("да")){
                        pacients[id_cart_pac].setProc(lechVrach[id_vrach_work].operasion());
                    }
                }
            }
        } else {
            System.out.println("Медсестра");

            System.out.println("добавить медсестру?");
            String otv = console.next();
            if(otv.equals("да")){
                String first_name = console.next();
                String second_name = console.next();
                String third_name = console.next();
                String boss = console.next();
                medSister[id_sister] = new med_sister(first_name, second_name, third_name, boss);
                id_sister++;
            }

            System.out.println("с какой медсестрой рабоать?");
            int id_med_pac = console.nextInt();

            medSister[id_med_pac].naznach();
        }
    }
}