package Zadanie_8;

import java.util.Scanner;

public class abiturient {
    Scanner console = new Scanner(System.in);
    public int id;
    public String first_name;
    public String second_name;
    public String third_name;
    public int fak;
    public int ocenka;

    public int getOcenka() {
        return ocenka;
    }

    public void setOcenka(int ocenka) {
        this.ocenka = ocenka;
    }

    public boolean ekz(){
        boolean sdal;
        System.out.println("Экзамен написан?");
        String da = console.next();
        if(da.equals("да")){
            sdal = true;
        } else {
            sdal = false;
        }
        return sdal;
    }
    public int getFak() {
        return fak;
    }

    public void setFak(int fak) {
        this.fak = fak;
    }

    public abiturient(int id, String first_name, String second_name, String third_name) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.third_name = third_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
