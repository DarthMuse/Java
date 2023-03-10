package Zadanie_6;

import java.util.Objects;
import java.util.Scanner;

public class window {
    Scanner console = new Scanner(System.in);
    private boolean lock;

    public window(boolean lock) {
        this.lock = lock;
    }

    public boolean lock(){
        System.out.println("Что сделать с окном?");
        System.out.println("1 - открыть, 2 - закрыть");
        String doing = console.next();
        if (doing.equals("1")){
            lock = true;
        } else {
            lock = false;
        }
        return lock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof window window)) return false;
        return lock == window.lock;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lock);
    }

    @Override
    public String toString() {
        return "window{" +
                "lock=" + lock +
                '}';
    }
}
