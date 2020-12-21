package com.tutorial;

import java.util.Arrays;

public class Email {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String gender;
    private String location;
    private StringBuilder stringBuilder = new StringBuilder();
    private String phoneNumber;
    private int inbox;

    Email(String firstName,String lastName,String userName){
        //inis all
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.gender="-";
        this.phoneNumber="-";
        this.location="-";
        this.inbox=1;
        //password
        getPassword();
        //Success
        System.out.println("\nEmail has been created!\n");
    }
    //change profile
    public void setFirstName(String firstName) {
        System.out.println(">first name has been changed<");
        this.firstName = firstName;
        getStringBuilder("------------\nYour firstname got changed\n");
        getInbox();
    }
    public void setLastName(String lastName) {
        System.out.println(">last name has been changed<");
        this.lastName = lastName;
        getStringBuilder("------------\nYour lastname got changed\n");
        getInbox();
    }
    public void setUserName(String userName) {
        System.out.println(">username has been changed<");
        this.userName = userName;
        getStringBuilder("------------\nYour username got changed\n");
        getInbox();
    }
    public void setGender(String gender) {
        System.out.println(">username has been changed<");
        this.gender = gender;
        getStringBuilder("------------\nYour gender got changed!\n");
        getInbox();
    }
    public void setPhoneNumber(String phoneNumber) {
        System.out.println(">Phone number has been changed<");
        this.phoneNumber = phoneNumber;
        getStringBuilder("------------\nYour phone number got changed!\n");
        getInbox();
    }
    public void setLocation(String location) {
        System.out.println(">Location has been changed<");
        this.location = location;
        this.stringBuilder.append("------------\nYour Location got changed\n");
        getInbox();
    }

    private String getPassword(){
        StringBuilder stringBuilder = new StringBuilder();
        String temp = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
        for (int i =0;i<10;i++){
            stringBuilder.append(temp.charAt((int)(Math.random()*temp.length())));
        }
        return this.password = stringBuilder.toString();
    }
    public void setPassword() {
        System.out.println("Your current password : "+this.password);
    }
    public void changePassword(String password){
         this.password = password;
         getStringBuilder("------------\nYour password got changed\n");
         getInbox();
    }

    public StringBuilder getStringBuilder(String stringBuilder) {
        return this.stringBuilder.append(stringBuilder);
    }

    public int getInbox() {
        return inbox++;
    }

    public void setInbox(){
        System.out.println("========================\nYou receive an new email\n========================");
        System.out.printf("%s/500 %24s\n",this.inbox,"Compose");
        System.out.printf("dear, %-15s %s\n",this.firstName,"(compose)");
        setPassword();
        System.out.println(stringBuilder);
    }
    public void displayProfile(){
        System.out.println("First Name   : "+this.firstName);
        System.out.println("Last Name    : "+this.lastName);
        System.out.println("User Name    : "+this.userName);
        System.out.println("Gmail        : "+this.userName+"@Gugle.id");
        System.out.println("Gender       : "+this.gender);
        System.out.println("Phone Number : "+this.phoneNumber);
        System.out.println("Location     : "+this.location);
    }
    public void composeEmail(){
        getInbox();
        getStringBuilder("------------\nYou have sent an email!\n");
        System.out.println("(Email has been sent!)");
    }
}
