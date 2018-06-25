public class Dodgem extends Attraction implements iTicketing{
    private double price;

    public Dodgem(String name, double price, int capacity){
        super(name, price, capacity);
    }


    public String bump() {
        return "SMASH";
    }

    public double defaultPrice(Visitor visitor){
        if (visitor.getAge() < 12)
           return this.price / 2;
        return this.price;}
}
