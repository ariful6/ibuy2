package com.example.ibuy;


public class Counter {
    private double counter;

    public Counter() {
        this.counter = counter;
    }

    public void increment() {
        if (this.counter <= 10) {
            this.counter++;

        }
    }

    public void decrement() {
        if (this.counter > 0) {
            this.counter--;
        }
    }

    public void reset() {
        this.counter = 0;
    }

    public double getcounter() {
        return this.counter;
    }
}

