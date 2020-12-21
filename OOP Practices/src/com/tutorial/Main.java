package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //Topic To Cover
        /*class,constructor, object, acces, modiifier, static, keywords,
        method overloading,method overriding, inherience, polymorphism,
        interfaces,Encapsulation, Using built in class
         */

        //create a new object from Vehicle class
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("city");
        System.out.println(vehicle1.getName());
        System.out.println(Vehicle.getCount());

        Car car1 = new Car("civic","black","2012","honda","2012",true,false);
        System.out.println(car1.getLedScreen());
        car1.setName("cars");
        System.out.println(car1.getName());
        System.out.println(Vehicle.getCount());

        //polymophism
        Vehicle vehicle2 = new Vehicle("Pazero","black","2017","civic","900");
        Bike bike = new Bike("Pazero","black","2017","civic","900",false);
        Car car = new Car("Pazero","black","2017","civic","900",true,true);
        Vehicle vehicle = new Bike("Pazero","black","2017","civic","900",false);
        Vehicle car2 = new Car("Pazero","black","2017","civic","900",false,false);
        System.out.println(vehicle2.getInfo());
        System.out.println(vehicle.getInfo());
        System.out.println(bike.getInfo());
        System.out.println(car.getInfo());
        System.out.println(car2.getInfo());
    }
}
