package bifunction;

import java.util.function.BiFunction;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/2/13
 * Time: 12:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
        return bi.apply(i1, i2);
    }
}
