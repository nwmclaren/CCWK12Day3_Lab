package Dealership;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name) {
        this.name = name;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public int vehicleSize(){
        return this.vehicles.size();
    }
}
