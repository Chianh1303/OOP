package org.example.oop;

public class Apple {
    private int weight;

    public Apple() {
        this.weight = 10;
    }

    public int getWeight() {
        return this.weight;
    }

    public void decrease() {
        if (this.weight > 0) {
            this.weight--;
        }
    }

    public boolean isEmpty() {
        return this.weight == 0;
    }
}
