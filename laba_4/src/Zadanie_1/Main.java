package Zadanie_1;

public class Main {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("samsung");
        Mobile mobile2 = new Mobile("sony");

        mobile1.add_model("2","12", "A212", "snap_dragon1", "3");
        mobile1.add_model("6","13", "A242", "snap_dragon2", "32");
        mobile2.add_model("3","15", "A252", "snap_dragon3", "23");
        mobile2.add_model("2","16", "A272", "snap_dragon4", "35");
    }
}