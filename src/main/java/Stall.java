import java.util.ArrayList;

public class Stall {
    private String name;
    private String ownerName;
    private int parkingSpot;
    private ArrayList<Visitor> visitors;

    public Stall(String name, String ownerName, int parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
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
}
