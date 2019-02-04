package cis.pkg2087.bicycle;
/**
 *  Basic bicycle class tracking a short biking segment keeping track of
 *     the bike's  cadence, gear and speed.
 * @author 
 */
public class Bicycle {
        
    // the Bicycle class has three fields
    protected int cadence;
    protected int gear;
    protected int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
    
    public int getCadence() { return this.cadence; }
    public int getGear() { return this.gear; }
    public int getSpeed() { return this.speed; }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public String toString() {
        String bike = "My Bike: " + this.speed + ", " + getCadence() + ", " + this.gear;
        return bike;
    }
    
    
    
    
        
}