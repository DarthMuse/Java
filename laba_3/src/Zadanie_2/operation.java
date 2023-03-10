package Zadanie_2;

public class operation {

    public void sum(double[] martix_one, double[] matrix_two, int n1){
        double[] rez = new double[martix_one.length];

        for (int i = 0; i < martix_one.length; i++){
            rez[i] = martix_one[i] + matrix_two[i];
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(rez[i] + " ");
            }
            System.out.println();
        }
    }

    public void vuch(double[] martix_one, double[] matrix_two, int n1){
        double[] rez = new double[matrix_two.length];

        for (int i = 0; i < martix_one.length; i++){
            rez[i] = martix_one[i] - matrix_two[i];
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
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
                    rez[i][j] += martix_one[i][k] * matrix_two[k][j];
                }
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(rez[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double one_norma(int n1, double[][] twoArray){
        double[] str = new double[n1];

        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n1; j++) {
                str[i] += twoArray[i][j];
            }
        }

        double max_i = -10000;
        for (int i = 0; i < n1; i++) {
            if(str[i] > max_i){
                max_i = str[i];
            }
        }

        return max_i;
    }

    public double two_norma(int n1, double[][] twoArray){
        double[] str = new double[n1];

        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n1; j++) {
                str[i] += twoArray[j][i];
            }
        }

        double max_j = -10000;
        for (int i = 0; i < n1; i++) {
            if(str[i] > max_j){
                max_j = str[i];
            }
        }

        return max_j;
    }
}
