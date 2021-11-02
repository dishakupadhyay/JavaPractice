package weeek14homework;

    /* Here I have used multilevel inheritance.
       From Electronic Devices to Mobile phone and Television is a one level inheritance.
       And from Mobile phone to Apple phone and Samsung phone is a 2nd level of inheritance */

public class ElectronicDevices { // Parent Class - Level1
    String colour;
    String model;

     /* For Method Overriding
        Here I have tried to include method overriding (Dynamic Polymorphism) together with the
        example of Inheritance */


    public void getTotalPrice() {
        System.out.println("Total Devices Price = £50,000");
    }
}
