import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pair<Integer, Integer> pair = new Pair<>(1, 2);

        List<Pair> list = new ArrayList<>();

        try {
            Class<?> cls = Class.forName("Pair");
            Method method = cls.getMethod("testPrint");
            method.invoke(cls.newInstance());

            list.add(pair);
            Pair pair1 = list.get(0);
            System.out.println("\n" + pair1.toString());

        } catch (Throwable e) {
            System.err.println(e);
        }



        PairTwo<Integer> pairTwo = new PairTwo<>(10, 20);
        System.out.println("\n2 - NORMALNE");
        pairTwo.print();

        pairTwo.setFirst(1);
        pairTwo.setSecond(2);
        System.out.println("\n2 - NORMALNE (Zmiana wartości)");
        pairTwo.print();

        PairTwo<Integer> pairTwoClone = (PairTwo<Integer>) pairTwo.clone();
        System.out.println("\n2 - KLON");
        pairTwoClone.print();

        PairTwo<Pair> pairThree = new PairTwo<>(pair, pair);
        System.out.println("\n3 - NORMALNE");
        pairThree.print();

        PairTwo<Pair> pairThreeClone = (PairTwo<Pair>) pairThree.clone();
        System.out.println("\n3 - KLON");
        pairThreeClone.print();
    }
}
