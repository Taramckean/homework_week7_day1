public class Playground extends Attraction implements iSecurity {

    public Playground(String name, double price, int capacity){
        super(name, price, capacity);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) return true;
        return false;
    }


}
