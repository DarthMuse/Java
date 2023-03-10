package Zadanie_6;

import java.util.Objects;
import java.util.Scanner;

public class door {
    Scanner console = new Scanner(System.in);
    private boolean lock;

    public door(boolean lock) {
        this.lock = lock;
    }

    public boolean lock_on_key(){
        System.out.println("Что сделать с дверью?");
        System.out.println("1 - открыть, 2 - закрыть на ключ");
        String doing = console.next();
        if (doing.equals("1")){
            lock = true;
        } else {
            lock = false;
        }
        return lock;
    }
    public boolean getLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {
        return "door{" +
                "lock=" + lock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof door door)) return false;
        return getLock() == door.getLock();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLock());
    }
}
