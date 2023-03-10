package Zadanie_3;

public class Main {
    public static void main(String[] args) {
    }

}
interface Worker{
    void work();
}

class Inginer implements Worker{
    private String name;
    @Override
    public void work() {
        System.out.println("инжинер работает!!!!!");
    }

    public Inginer(String name) {
        this.name = name;
    }
}

class Rukovoditel extends Inginer{
    private String name;
    @Override
    public void work() {
        System.out.println("Руководитель работает!!!!!");
    }

    public Rukovoditel(String name, String name1) {
        super(name);
        this.name = name1;
    }
}