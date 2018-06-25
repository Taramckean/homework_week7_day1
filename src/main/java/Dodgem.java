public class Dodgem extends Attraction implements iTicketing{

    public Dodgem(String name, double price, int capacity, int rating){
        super(name, price, capacity, rating);
    }


    public String bump() {
        return "SMASH";
    }

    public double defaultPrice(){
        return this.getPrice();
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12)
        {           return defaultPrice() / 2;}
        return defaultPrice();}
}
