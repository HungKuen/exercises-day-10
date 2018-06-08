package com.academy;

public class Car {
    private Tire[] wheels;
    private Door[] doors;
    private Glass[] glass;
    private float weight;


    public Car(float weight, Tire[] wheels, Door[] doors, Glass[] glass) {
        this.weight = weight;
        this.wheels = wheels;
        this.doors = doors;
        this.glass = glass;
       }

    public float getWeight() {
        float sum = this.weight;
        for(Tire t: this.wheels) {
            sum = sum + t.getWeight();
        }
        for (Door w: this.doors){
            sum = sum +w.getWeight();
        }
        for (Glass w: this.glass){
            sum = sum+w.getTotalWeight();
        }
        return sum;

    }
}
