public class Playground extends Attraction implements iSecurity {

    public Playground(String name, double price, int capacity, int rating){
        super(name, price, capacity, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) return true;
        return false;
    }


}
