package Zadanie_6;

public class house {

    private window[] windows = new window[100];
    private door[] doors = new door[100];

    public house(window[] windows, door[] doors) {
        this.windows = windows;
        this.doors = doors;
    }

    public window[] getWindows() {
        return windows;
    }

    public void setWindows(window[] windows) {
        this.windows = windows;
    }

    public door[] getDoors() {
        return doors;
    }

    public void setDoors(door[] doors) {
        this.doors = doors;
    }
}
