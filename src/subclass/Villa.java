package subclass;

import superclass.HouseSuperClass;

/**
 * This class represents a villa object, which extends the properties and methods of the HouseSuperClass.
 * It has an additional property, id, which represents a unique identifier for each house object.
 */
public class Villa extends HouseSuperClass {

    private int id;

    // constructor that initializes the properties inherited from subclass.House and the new property
    public Villa(double price, double squareMeter, int numberOfRooms, int numberOfHalls, int id) {
        super(price, squareMeter, numberOfRooms, numberOfHalls);
        this.id = id;
    }

    /*
     Returns a string representation of the house object, which is the string "house"
     followed by the id of the house.
     */
    @Override
    public String toString() {
        return "villa" + id;
    }
}
