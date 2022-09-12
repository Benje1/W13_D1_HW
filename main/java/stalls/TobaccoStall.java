package stalls;

import behaviours.ISecure;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecure {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    public boolean isAllowed(Visitor visitor) {
        if(visitor.getAge() > 18){
            return true;
        } else {
        return false;
        }
    }
}
