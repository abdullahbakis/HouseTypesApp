package superclass;

/**
This class represents a superclass of a house, it contains properties such as price, square meter,
number of rooms and number of halls. It has a constructor that initializes these properties,
and also has getters and setters for each of these properties.
 */
public class HouseSuperClass {
    double price;
    double squareMeter;
    int numberOfRooms;
    int numberOfHalls;

    // constructor that initializes the properties
    public HouseSuperClass(double price, double squareMeter, int numberOfRooms, int numberOfHalls) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
    }

    // getters and setters for the properties
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }
}
