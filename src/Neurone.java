import java.util.ArrayList;

public class Neurone {
    ArrayList<Float> weight;

    public Neurone(int n) {
        weight = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            weight.add((float) Math.random());
        }
    }
    public String toString() {
        String retour = "Neurone de poids : ";

        for (int i = 0; i < weight.size(); i++) {
            retour += weight.get(i);
        }
        return retour;
    }

    public float somme(ArrayList<Float> inputs) {
        float total=0;
    for (int i = 0; i < weight.size(); i++) {
        total += weight.get(i) * inputs.get(i);
            }
    return total;

     }
public int activation (float x){
        int y=0;
        if (x > 0.5) {
            y = 1;
        }
        else if (x <= 0.5) {
            y = 0;
        }
   return y;
    }
    public float calculerSortie(ArrayList<Float> inputs) {
        float s;
        s= activation(somme(inputs));
        return s;
    }
}

