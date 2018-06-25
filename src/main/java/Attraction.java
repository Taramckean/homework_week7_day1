import java.util.ArrayList;

public abstract class Attraction implements iReviewing{
    private String name;
    private int capacity;
    private double price;
    private int rating;
    private ArrayList<Visitor> visitors;

    public Attraction(String name, double price, int capacity, int rating){
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.rating = rating;
        this.visitors = new ArrayList<Visitor>();
    }

    public String getName() {
        return this.name;
    }

    public int getRating(){
        return this.rating;
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
