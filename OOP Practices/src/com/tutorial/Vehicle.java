package com.tutorial;

public class Vehicle {
//    Encapsulation
    private String name;
    private String color;
    private String modal;
    private String company;
    private String engine = "800";
    public static int count =0;

    //this is a constructor
    public Vehicle(){//constructor without paramter
        Vehicle.count++;
    }
    //parameter within constructor
    public Vehicle(String name, String color, String model, String company,String engine){
        this.name = name;
        this.color = color;
        this.modal = model;
        this.company = company;
        this.engine = engine;
        Vehicle.count++;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getCompany() {
        return this.company;
    }

    public String getModal() {
        return  this.modal;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    private String getEngine() {
        return this.engine;
    }
    public int getSpeed(){
        String a = getEngine();
        if (a.equals("800")){
            return 90;
        }else return 120;
    }
    //polymophism
    public String getInfo(){
        return "This is a vehicle ";
    }
    public static int getCount(){
        return Vehicle.count;
    }
}
