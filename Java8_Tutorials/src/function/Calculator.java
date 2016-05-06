package function;

import java.util.function.Function;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/2/13
 * Time: 12:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    public String calc(Function<Integer, String> bi, Integer i) {
        return bi.apply(i);
    }
}
