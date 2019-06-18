import java.util.Objects;

public class Chocolate extends Sweet {
    private ChocolatTypes types;

    public Chocolate(ChocolatTypes types, int weight) {
        super(weight);
        this.types = types;
    }

    public ChocolatTypes getTypes() {
        return types;
    }

    public void setTypes(ChocolatTypes types) {
        this.types = types;
    }

    @Override
    public int costCompute() {
        int cost = 1;
        switch (types) {
            case DARK:
                cost = getWeght() * 1000;
                break;
            case MILK:
                cost = getWeght() * 1200;
                break;
            case MEDIUM:
                cost = getWeght() * 2100;
                break;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "types=" + types +
                '}';
    }


}
