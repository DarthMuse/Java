package Zadanie_2;

public class Matrix {

    private int n1;
    private int n2;
    private int n3;

    public Matrix(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
    public double[][] twoArray;
    public double[] oneArray;
    public void zapolnenie(){
        twoArray = new double[n1][n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                twoArray[i][j] = (Math.random() * ((n3 - n2))) + n2;
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }

        int one_i = 0;
        oneArray = new double[n1 * n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                oneArray[one_i] = twoArray[i][j];
                one_i++;
            }
        }
    }
}
