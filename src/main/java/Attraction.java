import java.util.ArrayList;

public abstract class Attraction {
    private String name;
    private int capacity;
    private double price;
    private ArrayList<Visitor> visitors;

    public Attraction(String name, double price, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.visitors = new ArrayList<Visitor>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addVisitor(Visitor visitor) {
        this.visitors.add(visitor);
    }

    public int countVisitors() {
        return this.visitors.size();
    }

    public double getPrice(){
        return this.price;
    }
}
