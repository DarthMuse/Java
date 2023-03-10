package Zadanie_1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vector {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int z1;
    private int z2;

    public Vector(int x1, int y1, int z1, int x2, int y2, int z2){
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getZ1() {
        return z1;
    }

    public int getX2() {
        return x1;
    }

    public int getY2() {
        return y1;
    }

    public int getZ2() {
        return z1;
    }

    public boolean ort(int x11, int x12,
                       int y11, int y12,
                       int z11, int z12,
                       int x21, int x22,
                       int y21, int y22,
                       int z21, int z22){

        int sum = x11 * x12 + y11 * y12 + z11 * z12
                * x21 * x22 + y21 * y22 + z21 * z22;

        if (sum == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean per(int x11, int x12,
                       int y11, int y12,
                       int z11, int z12,
                       int x21, int x22,
                       int y21, int y22,
                       int z21, int z22){
        int v1; int v2; int v3; int v4;

        v1 = vektorMulti(x22 - x21, y22 - y21, x11 - x21, y11 - y21, z11 - z21, z11 - z21);
        v2 = vektorMulti(x22 - x21, y22 - y21, x12 - x21, y12 - y21, z12 - z21, z12 - z21);
        v3 = vektorMulti(x12 - x11, y21 - y11, x21 - x11, y21 - y21, z21 - z11, z21 - z11);
        v4 = vektorMulti(x12 - x11, y21 - y11, x22 - x11, y22 - y21, z22 - z11, z22 - z11);

        if (v1 * v2 < 0 && v3 * v4 < 0){
            return true;
        }
        else {
            return false;
        }
    }

    public int vektorMulti(int ax, int ay,
                           int az, int bx,
                           int by, int bz){
        return ax*by - bx*ay;
    }

    public boolean sravn(int x11, int x12,
                         int y11, int y12,
                         int z11, int z12,
                         int x21, int x22,
                         int y21, int y22,
                         int z21, int z22){

        double mod_one = sqrt(pow(x11, 2) + pow(x12, 2) + pow(y11, 2)
                + pow(y12, 2) + pow(z12, 2) + pow(z12, 2));
        double mod_two = sqrt(pow(x21, 2) + pow(x22, 2) + pow(y21, 2)
                + pow(y22, 2) + pow(z22, 2) + pow(z22, 2));

        if(mod_one == mod_two){
            return true;
        }
        else{
            return false;
        }

    }
}
