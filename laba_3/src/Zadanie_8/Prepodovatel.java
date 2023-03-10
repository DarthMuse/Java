package Zadanie_8;

public class Prepodovatel {
    public int id;
    public String first_name;
    public String second_name;
    public String third_name;

    public int ocenka(){
        int n2 = 5;
        int n1 = 2;
        int oc = (int) ((Math.random() * ((n2 - n1))) + n1);
        return oc;
    }
    public Prepodovatel(int id, String first_name, String second_name, String third_name) {
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
