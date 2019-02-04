/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.pkg2087.bicycle;

/**
 * This is the main routine that tests out the Bicycle and MountainBike objects
 * 
 * @author 
 */
public class CIS2087Bicycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Bicycle myBike = new Bicycle(1, 2, 3);
      MountainBike myMtnBike = new MountainBike(33, 1, 2, 3);
      
      System.out.println("My Bike speed: " + myBike.getSpeed());
      System.out.println("My Mountain Bike speed: " + myMtnBike.getSpeed());
      
      myBike.speedUp(5);
      myMtnBike.speedUp(3);
      
      System.out.println("My Bike speed: " + myBike.getSpeed());
      System.out.println("My Mountain Bike speed: " + myMtnBike.getSpeed()); 
      
      myBike.setCadence(7);
      System.out.println("My Bike cadence: " + myBike.getCadence());
      
      myMtnBike.setCadence(5);
      System.out.println("My Bike cadence: " + myMtnBike.getCadence());
      
      //This code fails, setHeight & getHeight are in MountainBike
      //myBike.setHeight(33);
      //System.out.println("My Bike cadence: " + myBike.getHeight());
      
      myMtnBike.setHeight(35);
      System.out.println("My Bike cadence: " + myMtnBike.getHeight());
      
      //Testing toString()
      System.out.println(myBike.toString());
      System.out.println(myMtnBike.toString());
      
      
    }
    
}
