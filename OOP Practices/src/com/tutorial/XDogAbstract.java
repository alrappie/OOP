package com.tutorial;

class Chihuahua extends XDog{
    @Override
    public void poop() {
        System.out.println("Dog pooped!");
    }
}

public class XDogAbstract {
    public static void main(String[] args) {
        Chihuahua d = new Chihuahua();
        d.bark();
        System.out.println(d.breed);
        d.poop();

    }
}
