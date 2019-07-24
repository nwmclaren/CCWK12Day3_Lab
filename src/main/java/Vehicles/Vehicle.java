package Vehicles;

public abstract class Vehicle {

    private String make;
    private String model;
    private String colour;
    private String price;

    public Vehicle(String make, String model, String colour, String price) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getPrice() {
        return price;
    }
}
