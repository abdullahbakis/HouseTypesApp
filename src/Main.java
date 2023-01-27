import service.HouseService;
import subclass.House;
import subclass.SummerHouse;
import subclass.Villa;
import superclass.HouseSuperClass;

import java.util.Arrays;
import java.util.List;

/**
 * Main class that demonstrates the usage of the HouseService class and the different types of houses
 */
public class Main {
    public static void main(String[] args) {
        // Creating objects of the different types of houses
        House house1 = new House(150000.0, 147.0, 2, 1,1);
        House house2 = new House(225000.0, 215.0, 4, 1, 2);
        House house3 = new House(437000.0, 259.0, 6, 2, 3);
        Villa villa1 = new Villa(328000.0, 370.0, 4, 2, 1);
        Villa villa2 = new Villa(565000.0, 430.0, 5, 3, 2);
        Villa villa3 = new Villa(614000.0, 580.0, 7, 3, 3);
        SummerHouse summerHouse1 = new SummerHouse(576000.0, 110, 2, 1, 1);
        SummerHouse summerHouse2 = new SummerHouse(634000.0, 157, 3, 1,2);
        SummerHouse summerHouse3 = new SummerHouse(727000.0, 190, 4, 1, 3);

        // Creating a list of all the houses
        List<HouseSuperClass> houses = Arrays.asList(house1, house2, house3, villa1, villa2, villa3,
                summerHouse1, summerHouse2, summerHouse3);

        // Creating an object of the HouseService class
        HouseService service = new HouseService();

        // Using the methods of the HouseService class to get statistics and filter the houses
        System.out.println("Total price of all houses: " + "$" + service.getTotalPriceByType(houses, House.class));
        System.out.println("Total price of all Villas: " + "$" + service.getTotalPriceByType(houses, Villa.class));
        System.out.println("Total price of all Summer Houses: " + "$" + service.getTotalPriceByType(houses, SummerHouse.class));
        System.out.println("Total price of all types of houses: " + "$" + service.getTotalPrice(houses));
        System.out.println("Average square meter of all houses: " + service.getAverageSquareMeterByType(houses, House.class) + " m^2");
        System.out.println("Average square meter of all Villas: " + service.getAverageSquareMeterByType(houses, Villa.class) + " m^2");
        System.out.println("Average square meter of all Summer Houses: " + service.getAverageSquareMeterByType(houses, SummerHouse.class) + " m^2");
        System.out.println("Average square meter of all types of houses: " + service.getAverageSquareMeter(houses) + " m^2");
        System.out.println("Filtered houses by rooms and halls (min 3 rooms and 2 halls): " + service.filterHousesByRoomsAndHalls(houses, 3, 1));
    }
}
