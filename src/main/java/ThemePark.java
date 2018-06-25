import java.util.ArrayList;

public class ThemePark extends Attraction {
    private ArrayList<Attraction> attractions;

    public ThemePark(String name, int capacity){
        super(name, capacity);
        this.attractions = new ArrayList<Attraction>();
    }
}
