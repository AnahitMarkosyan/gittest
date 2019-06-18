import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        List<Sweet> sweets = new ArrayList<>();
        sweets.add(new Chocolate(ChocolatTypes.DARK, 15));
        sweets.add(new Chocolate(ChocolatTypes.MEDIUM, 15));
        sweets.add(new Chocolate(ChocolatTypes.MILK, 15));
        sweets.add(new Cakes(CakesTypes.FruiteCakes, 15));
        sweets.add(new Cakes(CakesTypes.StandartCakes, 15));
        sweets.add(new Cakes(CakesTypes.ChocolateCakes, 15));
        System.out.println(Gift.createGift(sweets));

        String[] str = {"12345", "1234", "12345", "11", "1235"};
        String max = str[1];
        String max1 = str[0];
        String secondMax;
        if (str[0].length() > str[1].length()) {
            max = str[0];
            max1 = str[1];
        }
        for (int i = 2; i <str.length ; i++) {
            if (str[i].length() > max.length()){
                max1 = max;
                max = str[i];

            }
        }
        System.out.println(max1);

    }
    public static int cost(Sweet s){
        return s.costCompute();
    }
}
