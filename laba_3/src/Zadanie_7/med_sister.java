package Zadanie_7;

import java.util.Scanner;

public class med_sister {
    Scanner console = new Scanner(System.in);
    public String first_name;
    public String second_name;
    public String third_name;
    public String boss;

    public med_sister(String first_name, String second_name, String third_name, String boss) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.third_name = third_name;
        this.boss = boss;
    }
    public void naznach(){
        System.out.println("выполнить назначение");
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

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }


}
