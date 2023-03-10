package Zadanie_7;

public class Pacient {
    public String first_name;
    public String second_name;
    public String third_name;
    public int id_medic_cart;
    public String lechenie;
    public int vrach;
    public boolean end_lech;
    public boolean narush;
    public String oper;
    public String proc;
    public int lechushii;
    public int lech_vrach_naz;

    public boolean getEnd_lech() {
        return end_lech;
    }

    public boolean getNarush() {
        return narush;
    }

    public void setNarush(boolean narush) {
        this.narush = narush;
    }

    public void setEnd_lech(boolean end_lech) {
        this.end_lech = end_lech;
    }

    public int getLech_vrach_naz() {
        return lech_vrach_naz;
    }

    public void setLech_vrach_naz(int lech_vrach_naz) {
        this.lech_vrach_naz = lech_vrach_naz;
    }

    public int getLechushii() {
        return lechushii;
    }

    public void setLechushii(int lechushii) {
        this.lechushii = lechushii;
    }
    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public Pacient(String first_name, String second_name, String third_name,
                   int id_medic_cart, String lechenie, int vrach, boolean end_lech, boolean narush) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.third_name = third_name;
        this.id_medic_cart = id_medic_cart;
        this.lechenie = lechenie;
        this.vrach = vrach;
        this.end_lech = end_lech;
        this.narush = narush;
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

    public int getId_medic_cart() {
        return id_medic_cart;
    }

    public void setId_medic_cart(int id_medic_cart) {
        this.id_medic_cart = id_medic_cart;
    }

    public String getLechenie() {
        return lechenie;
    }

    public void setLechenie(String lechenie) {
        this.lechenie = lechenie;
    }
}
