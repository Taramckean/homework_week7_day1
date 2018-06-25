import java.util.ArrayList;

public abstract class Stall implements iTicketing {
    private String name;
    private String ownerName;
    private double price;
    private int parkingSpot;
    private ArrayList<Visitor> visitors;

    public Stall(String name, String ownerName, double price, int parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.price = price;
        this.parkingSpot = parkingSpot;
        this.visitors = new ArrayList<Visitor>();
    }


    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getParkingNumber() {
        return this.parkingSpot;
    }

    public void addVisitor(Visitor visitor) {
        this.visitors.add(visitor);
    }

    public int countVisitors() {
        return this.visitors.size();
    }
    public double defaultPrice(){
        return this.price;
    }
    public double priceFor(Visitor visitor){
        return this.price;
    }

}
