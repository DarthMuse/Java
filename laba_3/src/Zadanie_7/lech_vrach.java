package Zadanie_7;

import java.util.Scanner;

public class lech_vrach {
    Scanner console = new Scanner(System.in);
    public int id;
    public String first_name;
    public String second_name;
    public String third_name;
    public String specialnost;
    public String lechenie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String new_lech(){
        System.out.println("Новое лечение");
        String lech = console.next();
        return lech;
    }
    public String operasion(){
        System.out.println("Какую операцию назначить: ");
        String op = console.next();
        return op;
    }
    public String procedur(){
        System.out.println("Какую процедуру назначить: ");
        String pr = console.next();
        return pr;
    }
    public lech_vrach(int id, String first_name, String second_name, String third_name,
                      String specialnost, String lechenie) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.third_name = third_name;
        this.specialnost = specialnost;
        this.lechenie = lechenie;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getThird_name() {
        return third_name;
    }

    public void setThird_name(String third_name) {
        this.third_name = third_name;
    }

    public String getSpecialnost() {
        return specialnost;
    }

    public void setSpecialnost(String specialnost) {
        this.specialnost = specialnost;
    }

    public String getLechenie() {
        return lechenie;
    }

    public void setLechenie(String lechenie) {
        this.lechenie = lechenie;
    }
}
