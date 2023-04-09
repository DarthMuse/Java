package Zadanie_1;

public class Main {
    static AffableThread mSecondThread;
    static class AffableThread extends Thread
    {
        @Override
        public void run()	//Этот метод будет выполнен в побочном потоке
        {
            for (int i = 0; i < 5; i++) {
                try{
                    sleep(1000);		//Приостанавливает поток на 1 секунду
                }catch(InterruptedException e){}
                System.out.println("Left");
            }
        }
    }
    public static void main(String []args){
        System.out.println("Сделать 10 шагов");

        mSecondThread = new AffableThread();	//Создание потока
        mSecondThread.start();					//Запуск потока

        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);		//Приостанавливает поток на 1 секунду
            }catch(InterruptedException e){}
            System.out.println("Right");
        }

    }
}