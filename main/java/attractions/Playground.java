package attractions;

import behaviours.ISecure;
import people.Visitor;

public class Playground extends Attraction implements ISecure {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() > 15){
            return true;
        } else {
            return false;
        }
    }
}
