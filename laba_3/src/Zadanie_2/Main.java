package Zadanie_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сколько матриц будет вводится?");
        Scanner console = new Scanner(System.in);
        int col = console.nextInt();

        Matrix[] matrices = new Matrix[col];

        System.out.println("Размер матриц: ");
        int n1 = console.nextInt();

        System.out.println("Диапазон случайных чисел: ");
        int n2 = console.nextInt();
        int n3 = console.nextInt();

        for (int i = 0; i < col; i++){
            matrices[i] = new Matrix(n1, n2, n3);
        }

        int number_one;
        int number_two;
        System.out.println("С какими матрицами будут производится вычисления");
        System.out.println("Матрица 1: ");
        number_one = console.nextInt();
        System.out.println("Матрица 2: ");
        number_two = console.nextInt();

        operation operations = new operation();

        matrices[number_one].zapolnenie();
        matrices[number_two].zapolnenie();
        double[] Matrix_one = matrices[number_one].oneArray;
        double[] Matrix_two = matrices[number_two].oneArray;
        double[][] Matrix_one_one = matrices[number_one].twoArray;
        double[][] Matrix_two_two = matrices[number_two].twoArray;

        System.out.println("Сложение: ");
        operations.sum(Matrix_one, Matrix_two, n1);
        System.out.println("Вычитания: ");
        operations.vuch(Matrix_one, Matrix_two, n1);
        System.out.println("умножение: ");
        operations.umnoj(Matrix_one_one, Matrix_two_two, n1);

        System.out.println("У какой матрицы считать норму: ");
        int norma = console.nextInt();
        double[][] norma_matrix = matrices[norma].twoArray;
        System.out.println("Первая норма матрицы: ");
        System.out.println(operations.one_norma(n1, norma_matrix));
        System.out.println("Вторая норма матрицы: ");
        System.out.println(operations.two_norma(n1, norma_matrix));

        double max_norma_one = -1000;
        double max_norma_two = -1000;

        for (int i = 0; i < n1; i++) {
            if (max_norma_one < operations.one_norma(n1, matrices[i].twoArray)){
                max_norma_one = operations.one_norma(n1, matrices[i].twoArray);
            }
        }

        for (int i = 0; i < n1; i++) {
            if (max_norma_two < operations.two_norma(n1, matrices[i].twoArray)){
                max_norma_two = operations.two_norma(n1, matrices[i].twoArray);
            }
        }
    }
}