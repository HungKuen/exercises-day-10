package com.academy;

public class Main {

    public static void main(String[] args) {

        Tire[] tires = new Tire[4];

        for (int i =0; i<tires.length; i++){
            tires[i] = new Tire();
        }

        Door[] doors = new Door[4];

        for (int i =0; i<doors.length;i++){
            doors[i] = new Door(150f);
        }

       Glass[] glass = new Glass[1];

        for (int i=0;i<glass.length;i++){
            glass[i] = new Glass();
        }




        Car car = new Car(1000, tires, doors, glass);
       System.out.println(car.getWeight());
    }
}
