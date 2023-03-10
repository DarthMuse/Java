package Zadanie_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("сколько дома дверей?");
        int n1 = console.nextInt();
        door[] doors = new door[n1];
        doors[0] = new door(false);

        System.out.println("сколько дома окон?");
        int n2 = console.nextInt();
        window[] windows = new window[n2];
        windows[0] = new window(false);

        house houses = new house(windows, doors);

        doors[0].lock_on_key();
        if(doors[0].getLock()){
            System.out.println("дверь закрыта");
        } else {
            System.out.println("дверь открыта");
        }

        windows[0].lock();
        if(doors[0].getLock()){
            System.out.println("окно закрыто");
        } else {
            System.out.println("окно открыто");
        }

        System.out.println("В этом доме столько дверей: " + houses.getDoors().length);
        System.out.println("В этом доме столько окон: " + houses.getWindows().length);
    }
}