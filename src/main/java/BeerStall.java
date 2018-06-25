public class BeerStall extends Stall implements iSecurity {


    public BeerStall(String name, String ownerName, double price, int parkingSpot) {
        super(name, ownerName, price, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) return true;
        return false;
    }
}
