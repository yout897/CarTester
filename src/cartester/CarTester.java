/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *  Author: Alex DiCarlo
 *  Date: 13/10/2016
 *  Purpose: To create different types of cars using the car class, from there
 *           it will print the cars information.
 */
public class CarTester {

    public static void main(String[] args) {
        //Car Instantiation
        Car car1 = new Car("Toyato", "Corolla",2017,17919,132,true);
        Car car2 = new Car("Dodge","Challenger",2016,true);
        Car car3 = new Car();
        //Print out the cars information
        System.out.println(car1.toString());
        System.out.println("\n");
        System.out.println(car2.toString());
        System.out.println("\n");
        System.out.println(car3.toString());
        System.out.println("\n");
        car1.honk();
    }
    
}
