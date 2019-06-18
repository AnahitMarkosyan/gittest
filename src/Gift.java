import java.util.*;

public abstract class Gift {

    public Gift() {
    }

    public static Set<Sweet> createGift(List<Sweet> sweetsList){
        Set<Sweet> sweets = new TreeSet<>(Comparator.comparing(Sweet::costCompute));
        Random r = new Random();
        sweets.add(sweetsList.get(r.nextInt(sweetsList.size())));
        sweets.add(sweetsList.get(r.nextInt(sweetsList.size())));
        sweets.add(sweetsList.get(r.nextInt(sweetsList.size())));

        return  sweets;
    }
}
