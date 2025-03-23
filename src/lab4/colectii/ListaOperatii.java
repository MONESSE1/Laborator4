import java.util.*;

public class ListaOperatii {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11)); //
        }

        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        List<Integer> xPlusY = new ArrayList<>(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        Set<Integer> zSet = new TreeSet<>(xPlusY);

        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);


        int p = 4;
        List<Integer> xPlusYLimitedByP = xPlusY.subList(0, Math.min(p, xPlusY.size()));



    }
}