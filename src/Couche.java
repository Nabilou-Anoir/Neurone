import java.util.ArrayList;

public class Couche {
    private ArrayList<Neurone> neurones;


    public Couche(int n) {
        neurones = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            neurones.add(new Neurone(2));
        };
    }

}
