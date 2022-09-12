import attractions.Attraction;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Visitor> visitors;
    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark(ArrayList<Visitor> visitors, ArrayList<Stall> stalls, ArrayList<Attraction> attractions) {
        this.visitors = visitors;
        this.stalls = stalls;
        this.attractions = attractions;
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    public void addStall(Stall stall){
        stalls.add(stall);
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }



    public int getAllReviewed(){
        int scores = 0;
        for(Attraction attraction : this.attractions){
            scores += attraction.getRating();
        }
        return scores;
    }

    public void attractionVisited(Attraction attraction, Visitor visitor){
        attraction.visited();
        visitor.visitedAttraction(attraction);
    }
}
