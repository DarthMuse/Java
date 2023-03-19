package Zadanie_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Сколько векторов будет вводится?");
        Scanner console = new Scanner(System.in);
        int col = console.nextInt();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Vector[] vectors = new Vector[col];

        String x1;
        String x2;
        String y1;
        String y2;
        String z1;
        String z2;
        
        for (int i = 0; i < col; i++) {
            try {
                System.out.println("Введите Х1: ");
                x1 = console.next();
                try {
                    Double.parseDouble(x1);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода. Введите повторно");
                    x1 = console.next();
                }
                System.out.println("Введите Х2: ");
                x2 = console.next();
                try {
                    Double.parseDouble(x2);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода. Введите повторно");
                    x2 = console.next();
                }
                System.out.println("Введите Y1: ");
                y1 = console.next();
                try {
                    Double.parseDouble(y1);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода. Введите повторно");
                    y1 = console.next();
                }
                System.out.println("Введите Y2: ");
                y2 = console.next();
                try {
                    Double.parseDouble(y2);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода. Введите повторно");
                    y2 = console.next();
                }
                System.out.println("Введите Z1: ");
                z1 = console.next();
                try {
                    Double.parseDouble(z1);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода. Введите повторно");
                    z1 = console.next();
                }
                System.out.println("Введите Z2: ");
                z2 = console.next();
                try {
                    Double.parseDouble(z2);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода. Введите повторно");
                    z2 = console.next();
                }
                vectors[i] = new Vector(Integer.parseInt(x1), Integer.parseInt(y1), Integer.parseInt(z1),
                        Integer.parseInt(x2), Integer.parseInt(y2), Integer.parseInt(z2));
            } catch (OutOfMemoryError E) {
                System.out.println("Нехватка памяти");
            }

        }

        String number_one;
        String number_two;
        System.out.println("номер вектора 1: ");
        number_one = console.next();
        try {
            Double.parseDouble(number_one);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода. Введите повторно");
            number_one = console.next();
        }
        System.out.println("номер вектора 2: ");
        number_two = console.next();

        int x11 = vectors[Integer.parseInt(number_one)].getX1();
        int y11 = vectors[Integer.parseInt(number_one)].getY1();
        int z11 = vectors[Integer.parseInt(number_one)].getZ1();
        int x21 = vectors[Integer.parseInt(number_one)].getX2();
        int y21 = vectors[Integer.parseInt(number_one)].getY2();
        int z21 = vectors[Integer.parseInt(number_one)].getZ2();

        int x12 = vectors[Integer.parseInt(number_two)].getX1();
        int y12 = vectors[Integer.parseInt(number_two)].getY1();
        int z12 = vectors[Integer.parseInt(number_two)].getZ1();
        int x22 = vectors[Integer.parseInt(number_two)].getX2();
        int y22 = vectors[Integer.parseInt(number_two)].getY2();
        int z22 = vectors[Integer.parseInt(number_two)].getZ2();

        System.out.print("Комплонарны ли вектора? - ");
        System.out.println(vectors[Integer.parseInt(number_one)].ort(x11, x12, y11, y12, z11,
                z12, x21, x22, y21, y22, z21, z22));


        if(!vectors[Integer.parseInt(number_one)].ort(x11, x12, y11, y12, z11, z12,
                x21, x22, y21, y22, z21, z22)){
            System.out.print("пересекаются ли вектора? - ");
            System.out.println(vectors[Integer.parseInt(number_one)].per(x11, x12, y11, y12, z11, z12,
                    x21, x22, y21, y22, z21, z22));
        }

        System.out.println("вектора одинаковой длинны? - ");
        System.out.println(vectors[Integer.parseInt(number_one)].sravn(x11, x12, y11, y12, z11, z12,
                x21, x22, y21, y22, z21, z22));
    }
}



