import java.util.Objects;

public class Cakes extends Sweet {
    private CakesTypes types;


    public Cakes(CakesTypes types, int weight) {
        super(weight);
        this.types = types;
    }

    public CakesTypes getTypes() {
        return types;
    }

    public void setTypes(CakesTypes types) {
        this.types = types;
    }

    @Override
    public int costCompute() {
        int cost = 1;
        switch (types) {
            case FruiteCakes:
                cost = getWeght() * 500;
                break;
            case StandartCakes:
                cost = getWeght() * 420;
                break;
            case ChocolateCakes:
                cost = getWeght() * 700;
                break;
        }
        int x = 11;
        int y = 81;
        return cost;
    }

    @Override
    public String toString() {
        return "Cakes{" +
                "types=" + types +
                '}';
    }
}
