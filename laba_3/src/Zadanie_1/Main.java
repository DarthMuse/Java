package Zadanie_1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Сколько векторов будет вводится?");
        Scanner console = new Scanner(System.in);
        int col = console.nextInt();

        Vector[] vectors = new Vector[col];

        for (int i = 0; i < col; i++) {
            System.out.println("Введите Х1: ");
            int x1 = console.nextInt();
            System.out.println("Введите Х1: ");
            int x2 = console.nextInt();
            System.out.println("Введите Y1: ");
            int y1 = console.nextInt();
            System.out.println("Введите Y2: ");
            int y2 = console.nextInt();
            System.out.println("Введите Z1: ");
            int z1 = console.nextInt();
            System.out.println("Введите Z2: ");
            int z2 = console.nextInt();
            vectors[i] = new Vector(x1, y1, z1, x2, y2, z2);
        }

        int number_one;
        int number_two;
        System.out.println("номер вектора 1: ");
        number_one = console.nextInt();
        System.out.println("номер вектора 2: ");
        number_two = console.nextInt();

        int x11 = vectors[number_one].getX1();
        int y11 = vectors[number_one].getY1();
        int z11 = vectors[number_one].getZ1();
        int x21 = vectors[number_two].getX2();
        int y21 = vectors[number_two].getY2();
        int z21 = vectors[number_two].getZ2();

        int x12 = vectors[number_one].getX1();
        int y12 = vectors[number_one].getY1();
        int z12 = vectors[number_one].getZ1();
        int x22 = vectors[number_two].getX2();
        int y22 = vectors[number_two].getY2();
        int z22 = vectors[number_two].getZ2();

        System.out.print("Комплонарны ли вектора? - ");
        System.out.println(vectors[number_one].ort(x11, x12, y11, y12, z11,
                z12, x21, x22, y21, y22, z21, z22));


        if(!vectors[number_one].ort(x11, x12, y11, y12, z11, z12,
                x21, x22, y21, y22, z21, z22)){
            System.out.print("пересекаются ли вектора? - ");
            System.out.println(vectors[number_one].per(x11, x12, y11, y12, z11, z12,
                    x21, x22, y21, y22, z21, z22));
        }

        System.out.println("вектора одинаковой длинны? - ");
        System.out.println(vectors[number_one].sravn(x11, x12, y11, y12, z11, z12,
                x21, x22, y21, y22, z21, z22));
    }
}



