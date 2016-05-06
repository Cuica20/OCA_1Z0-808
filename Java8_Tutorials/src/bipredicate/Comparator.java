package bipredicate;

import java.util.function.BiPredicate;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/2/13
 * Time: 12:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class Comparator {

    public static boolean
    compare(BiPredicate<Integer, Integer> bi, Integer i1, Integer i2) {
        return bi.test(i1, i2);
    }

    public static void main(String[] args) {

        // i1 -> 10
        // i2 -> 5
        // true if a/2 == b
        boolean result = compare((a, b) -> a / 2 == b, 10, 5);

        System.out.println("Compare result: " + result);
    }
}
