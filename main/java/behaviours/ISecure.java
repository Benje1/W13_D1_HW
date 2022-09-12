package behaviours;

import people.Visitor;

public interface ISecure {

    public boolean isAllowed(Visitor visitor);
}
