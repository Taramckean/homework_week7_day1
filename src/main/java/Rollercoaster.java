public class Rollercoaster extends Attraction implements iTicketing {

    public Rollercoaster(String name, double price, int capacity){
        super(name, price, capacity);
    }

    public double defaultPrice(){
            return this.getPrice();}


     public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200)
            return defaultPrice() * 2;
        return defaultPrice();}


}
