package Zadanie_2;

public class operation {

    public void sum(double[] martix_one, double[] matrix_two, int n1){
        double[] rez = new double[martix_one.length];

        for (int i = 0; i < martix_one.length; i++){
            try {
                rez[i] = martix_one[i] + matrix_two[i];
                try {
                    Double.parseDouble(Integer.toString((int) rez[i]));
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка вычисления");
                }
            } catch (OutOfMemoryError E) {
                System.out.println("Нехватка памяти");
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                try {
                    System.out.print(rez[i] + " ");
                    try {
                        Double.parseDouble(Integer.toString((int) rez[i]));
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка вычисления");
                    }
                } catch (OutOfMemoryError E) {
                    System.out.println("Нехватка памяти");
                }
            }
            System.out.println();
        }
    }

    public void vuch(double[] martix_one, double[] matrix_two, int n1){
        double[] rez = new double[matrix_two.length];

        for (int i = 0; i < martix_one.length; i++){
            try {
                rez[i] = martix_one[i] - matrix_two[i];
                try {
                    Double.parseDouble(Integer.toString((int) rez[i]));
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка вычисления");
                }
            } catch (OutOfMemoryError E) {
                System.out.println("Нехватка памяти");
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                try {
                    try {
                        Double.parseDouble(Integer.toString((int) rez[i]));
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка вычисления");
                    }
                } catch (OutOfMemoryError E) {
                    System.out.println("Нехватка памяти");
                }
                System.out.print(rez[i] + " ");
            }
            System.out.println();
        }
    }
    public void umnoj(double[][] martix_one, double[][] matrix_two, int n1){
        double[][] rez = new double[n1][n1];

        for (int i = 0; i < martix_one.length; i++) {
            for (int j = 0; j < matrix_two[0].length; j++) {
                for (int k = 0; k < matrix_two.length; k++) {
                    try {
                        rez[i][j] += martix_one[i][k] * matrix_two[k][j];
                        try {
                            Double.parseDouble(Integer.toString((int) rez[i][j]));
                        } catch (NumberFormatException e) {
                            System.out.println("Ошибка вычисления");
                        }
                    } catch (OutOfMemoryError E) {
                        System.out.println("Нехватка памяти");
                    }
                }
            }
        }

        for (int i = 0; i < n1; i++) {
            try {
                for (int j = 0; j < n1; j++) {

                    System.out.print(rez[i][j] + " ");
                    try {
                        Double.parseDouble(Integer.toString((int) rez[i][j]));
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка вычисления");
                    }
                }
                System.out.println();
            } catch (OutOfMemoryError E) {
                System.out.println("Нехватка памяти");
            }
        }
    }

    public double one_norma(int n1, double[][] twoArray){
        double[] str = new double[n1];

        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n1; j++) {
                try {
                    str[i] += twoArray[i][j];
                    try {
                        Double.parseDouble(Integer.toString((int) str[i]));
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка вычисления");
                    }
                } catch (OutOfMemoryError E) {
                    System.out.println("Нехватка памяти");
                }
            }
        }

        double max_i = -10000;
        for (int i = 0; i < n1; i++) {
            try {
                if(str[i] > max_i){
                    max_i = str[i];
                    try {
                        Double.parseDouble(Integer.toString((int) max_i));
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка вычисления");
                    }
                }
            } catch (OutOfMemoryError E) {
                System.out.println("Нехватка памяти");
            }
        }
        return max_i;
    }

    public double two_norma(int n1, double[][] twoArray){
        double[] str = new double[n1];

        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n1; j++) {
                try {
                    str[i] += twoArray[j][i];
                    try {
                        Double.parseDouble(Integer.toString((int) str[i]));
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка вычисления");
                    }
                } catch (OutOfMemoryError E) {
                    System.out.println("Нехватка памяти");
                }
            }
        }

        double max_j = -10000;
        for (int i = 0; i < n1; i++) {
            try {
                if(str[i] > max_j){
                    max_j = str[i];
                    try {
                        Double.parseDouble(Integer.toString((int) max_j));
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка вычисления");
                    }
                }
            } catch (OutOfMemoryError E) {
                System.out.println("Нехватка памяти");
            }
        }
        return max_j;
    }
}
