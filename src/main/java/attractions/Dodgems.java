package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed, IReviewed {

    public double defaultPrice(){
        return 8.4;
    }

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double getDefaultPrice() {
        return 4.5;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return 2.25;
        }
        return 4.5;
    }
}
