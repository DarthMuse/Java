package Zadanie_2;

public class Main {
    static Proizv FirstThread;
    static Magaz SecondThread;
    static Pokup ThreadThread;
    static boolean cheach_dostavka;
    static boolean cheach_nalichie;
    static class Proizv extends Thread
    {
        @Override
        public void run()	//Этот метод будет выполнен в побочном потоке
        {
            double x = 0;
            for (int i = 0; i < 5; i++) {
                try{
                    sleep(2000);//Приостанавливает поток на 1 секунду
                    x = Math.random();
                }catch(InterruptedException e){}
                if (x > 0.5){
                    System.out.println("отправить товар");
                    cheach_dostavka = true;
                }
            }
        }
    }
    static class Magaz extends Thread
    {
        @Override
        public void run()	//Этот метод будет выполнен в побочном потоке
        {
            for (int i = 0; i < 5; i++) {
                try{
                    sleep(1000);		//Приостанавливает поток на 1 секунду
                }catch(InterruptedException e){}
                if (cheach_dostavka){
                    System.out.println("товар доставлен, можно забрать");
                    cheach_nalichie = true;
                } else {
                    System.out.println("Товар ожидается");
                }
            }
        }
    }
    static class Pokup extends Thread
    {
        @Override
        public void run()	//Этот метод будет выполнен в побочном потоке
        {
            for (int i = 0; i < 5; i++) {
                try{
                    sleep(1000);		//Приостанавливает поток на 1 секунду
                }catch(InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (cheach_nalichie){
                    System.out.println("товар забрали");
                    cheach_nalichie = false;
                }
            }
        }
    }
    public static void main(String []args){
        FirstThread = new Proizv();
        FirstThread.start();
        SecondThread = new Magaz();	//Создание потока
        SecondThread.start();
        ThreadThread = new Pokup();
        ThreadThread.start();//Запуск потока
    }
}