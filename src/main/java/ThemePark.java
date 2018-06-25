import java.util.ArrayList;

public class ThemePark extends Attraction {
    private ArrayList<Attraction> attractions;

    public ThemePark(String name, double price, int capacity, int rating){
        super(name, price, capacity, rating);
        this.attractions = new ArrayList<Attraction>();
    }

    public void addToThemePark(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public int countAttractions() {
        return this.attractions.size();
    }
}
