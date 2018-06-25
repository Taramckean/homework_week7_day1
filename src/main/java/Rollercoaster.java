public class Rollercoaster extends Attraction implements iTicketing, iSecurity{

    public Rollercoaster(String name, double price, int capacity){
        super(name, price, capacity);
    }

    public double defaultPrice(){
            return this.getPrice();}


     public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200)
            return defaultPrice() * 2;
        return defaultPrice();}

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145)
        return true;{
        return false;}
    }
}
