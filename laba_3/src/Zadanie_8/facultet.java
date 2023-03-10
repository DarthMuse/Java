package Zadanie_8;

public class facultet {
    public int id;
    public double sr;
    public int n;
    public String name;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double pr_ball(){
        double ball = 0;
        ball = sr / n;
        return ball;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSr() {
        return sr;
    }

    public void setSr(double sr) {
        this.sr = sr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
