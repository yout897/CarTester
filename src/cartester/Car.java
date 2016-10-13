/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *  Author: Alex DiCarlo
 *  Date: 13/10/2016
 *  Purpose: To create a series of cars information to be used in the CarTester class.
 */
public class Car {
    //Variables
    String make,model;
    int year,price,horsePower;
    boolean canDrive;
    
    //Default Contructer, that creates a camaro to be printed
    public Car(){
        make = "Chevrolet";
        model = "Camaro";
        year = 2016;
        price = 26695;
        horsePower = 275;
        canDrive = true;
    }
    //Second Contructor, that takes in all the needed information from the CarTester program
    public Car(String mke,String mdel,int yar,int prce,int hosePower,boolean anDrive){
        make = mke;
        model = mdel;
        year = yar;
        price = prce;
        horsePower = hosePower;
        canDrive = anDrive;
    }
    //Final Contructor, that takes in only a couple of inputs, and creates random information for the others
    public Car(String mke, String mdel,int yar,boolean anDrive){
        make = mke;
        model = mdel;
        year = yar;
        price = (int)(Math.ceil(Math.random()*40000)+20000);
        horsePower = (int)(Math.ceil(Math.random()*300)+150);
        canDrive = anDrive;
    }
    //Puts the information into a string format
    public String toString(){
        String out = ("Make: " + make + "\n");
        out += ("Model: " + model + "\n");
        out += ("Year: " + year + "\n");
        out += ("Price: $" + price + "\n");
        out += ("HorsePower: " + horsePower + "\n");
        //Checks if the canDrive variabe is true of false, and performs an action based on that situation
        if(canDrive){
            out += ("Is the car drivable: Yes");
        }else{
            out += ("Is the car drivable: No");
        }
        return out;
    }
    //I mean it honks, by printing set honk to the console
    public void honk(){
        System.out.println("Honk Honk Honk");
    }
}
