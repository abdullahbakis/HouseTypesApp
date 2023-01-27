package service;

import subclass.Villa;
import superclass.HouseSuperClass;

import java.util.ArrayList;
import java.util.List;

/**
    The HouseService class provides various methods for calculating and filtering properties
of a list of HouseSuperClass objects.
 */
public class HouseService {

    /*
        The getTotalPrice method takes in a list of HouseSuperClass objects and calculates
    the total price of all the houses in the list by iterating through the list and adding
    the price of each house to a running total.
     */
    public double getTotalPrice(List<HouseSuperClass> houses) {
        double totalPrice = 0;
        for (HouseSuperClass house : houses) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    /*
        The getTotalPriceByType method is similar to the getTotalPrice method,
    but it only includes houses in the total price calculation that are of the specified type.
    The type is passed as a parameter in the form of a Class object.
     */
    public double getTotalPriceByType(List<HouseSuperClass> houses, Class<? extends HouseSuperClass> type) {
        double totalPrice = 0;
        for (HouseSuperClass house : houses) {
            if (house.getClass().equals(type)) {
                totalPrice += house.getPrice();
            }
        }
        return totalPrice;
    }

    /*
    The getAverageSquareMeter method calculates the average square meter of all
    the houses in the list by iterating through the list, adding the square meter
    of each house to a running total, and then dividing that total by the number of houses in the list.
     */
    public double getAverageSquareMeter(List<HouseSuperClass> houses) {
        if (houses.isEmpty()) {
            return 0;
        }
        double totalSquareMeter = 0;
        for (HouseSuperClass house : houses) {
            totalSquareMeter += house.getSquareMeter();
        }
        return totalSquareMeter / houses.size();
    }

    /*
        The getAverageSquareMeterByType method is similar to the getAverageSquareMeter method,
    but it only includes houses in the average calculation that are of the specified type.
    Like the getTotalPriceByType method, the type is passed as a parameter in the form of a Class object.
     */
    public double getAverageSquareMeterByType(List<HouseSuperClass> houses, Class<? extends HouseSuperClass> type) {
        double totalSquareMeter = 0;
        int count = 0;
        for (HouseSuperClass house : houses) {
            if (house.getClass().equals(type)) {
                totalSquareMeter += house.getSquareMeter();
                count++;
            }
        }
        return count > 0 ? totalSquareMeter / count : 0;
    }

    /*
    The filterHousesByRoomsAndHalls method takes in a list of HouseSuperClass objects and two integer
    values for minimum number of rooms and halls, and returns a new list of houses that have at least
    that many rooms and halls. If the house is a Villa, it will check for number of rooms and halls in Villa,
    otherwise it will check for number of rooms and halls in HouseSuperClass.
     */
    public List<HouseSuperClass> filterHousesByRoomsAndHalls(List<HouseSuperClass> houses, int minRooms, int minHalls) {
        List<HouseSuperClass> filteredHouses = new ArrayList<>();
        for (HouseSuperClass house : houses) {
            if (house instanceof Villa) {
                Villa villa = (Villa) house;
                if (villa.getNumberOfRooms() >= minRooms && villa.getNumberOfHalls() >= minHalls) {
                    filteredHouses.add(villa);
                }
            } else if (house.getNumberOfRooms() >= minRooms && house.getNumberOfHalls() >= minHalls) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }

}