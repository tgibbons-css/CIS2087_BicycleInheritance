package cis.pkg2087.bicycle;
/**
 * This class inherits from the Bicycle class adding the seat height attribute
 * 
 * @author 
 */
public class MountainBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }  
    
    public int getHeight() { 
        return this.seatHeight; 
    }
    
    
    public String toString() {
        String bike = "My MountainBike: " + this.speed + ", " + getCadence() + ", " + this.gear + ", " + this.seatHeight;
        return bike;
    }    
    
}