package prototype;

public class AvionPrototype implements Prototype {

    private String model;
    private String fuelCapacity;
    private String engine;
    private String serialNumber;
    private String fuelType;
    private String seatCapacity;

    public AvionPrototype() {}

    public AvionPrototype(Prototype prototype) {
        AvionPrototype avionPrototype = (AvionPrototype) prototype;
        this.model = avionPrototype.model;
        this.fuelCapacity = avionPrototype.fuelCapacity;
        this.engine = avionPrototype.engine;
        this.serialNumber = avionPrototype.serialNumber;
        this.fuelType = avionPrototype.fuelType;
        this.seatCapacity = avionPrototype.seatCapacity;
    }

    @Override
    public  Prototype clone() {
        return new AvionPrototype(this);
    }
}
