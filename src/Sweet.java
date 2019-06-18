import java.util.Objects;

public class Sweet {
    private int weight;
    public Sweet() {

    }

    public Sweet(int weight) {
        this.weight = weight;
    }

    public int getWeght() {
        return weight;
    }

    public void setWeght(int weight) {
        this.weight = weight;
    }

    public int costCompute(){
        return 1;
    }
}
