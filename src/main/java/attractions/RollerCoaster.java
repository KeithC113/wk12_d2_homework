package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, IReviewed {

    public double defaultPrice(){
     return 8.4;
    }

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedToRide(Visitor visitor){
        if (visitor.getAge() >12 && visitor.getHeight() >145){
            return true;
        }
            return false;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() >= 200){
            return defaultPrice() * 2;
        }
        else{
            return defaultPrice();
        }
    }
}
