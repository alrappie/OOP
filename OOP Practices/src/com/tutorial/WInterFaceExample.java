package com.tutorial;

public class WInterFaceExample implements WaterBottleInterface{
    public static void main(String[] args) {

        WInterFaceExample example = new WInterFaceExample();
        System.out.println(color);
        System.out.println(name);
//        System.out.println(sponsorship);
        example.fillUp();
        example.pourOut();

    }

    @Override
    public void fillUp() {
        System.out.println("fillUp the water please!");
    }

    @Override
    public void pourOut() {
        System.out.println("pourOut the water please!");
    }
}
