package Zadanie_4;

import java.util.Arrays;

public class Abiturient {
    public int id;
    public String first_name;
    public String second_name;
    public String third_name;
    public String address;
    public int number_phone;
    public int[] ocenki;

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", third_name='" + third_name + '\'' +
                ", address='" + address + '\'' +
                ", number_phone=" + number_phone +
                ", ocenki=" + Arrays.toString(ocenki) +
                '}';
    }

    public Abiturient(int id, String first_name, String second_name, String third_name, String address, int number_phone, int[] ocenki) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.third_name = third_name;
        this.address = address;
        this.number_phone = number_phone;
        this.ocenki = ocenki;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(int number_phone) {
        this.number_phone = number_phone;
    }

    public int[] getOcenki() {
        return ocenki;
    }

    public void setOcenki(int[] ocenki) {
        this.ocenki = ocenki;
    }
}
