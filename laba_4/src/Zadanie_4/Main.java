package Zadanie_4;

public class Main {
    public static void main(String[] args) {
    }

    interface Zdanie{
        void build();
    }
    abstract class Soshial_zdanie implements Zdanie{
        public String name;

        public Soshial_zdanie(String name) {
            this.name = name;
        }

        @Override
        public void build() {
            System.out.println("Здание стоится");
        }
        abstract void close();
    }
    class Theater extends Soshial_zdanie{
        @Override
        void close() {
            System.out.println("Здание закрылось");
        }

        public Theater(String name) {
            super(name);
        }
    }
}