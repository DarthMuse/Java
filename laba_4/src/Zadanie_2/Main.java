package Zadanie_2;

public class Main {
    public static void main(String[] args) {
        Vistovka vistovka1 = new Vistovka("pank", "9:00", "19:00", "20.01.2023");
        Vistovka vistovka2 = new Vistovka("classic", "9:00", "19:00", "21.01.2023");

        vistovka1.add_picture("1", "roman");
        vistovka1.add_picture("2", "ivan");
        vistovka2.add_picture("3", "Sasha");
        vistovka2.add_picture("4", "Dasha");
    }
}