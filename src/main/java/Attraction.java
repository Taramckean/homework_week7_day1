import java.util.ArrayList;

public abstract class Attraction {
    private String name;
    private int capacity;
    private ArrayList<Visitor> visitors;

    public Attraction(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
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
}
