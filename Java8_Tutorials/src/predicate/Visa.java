package predicate;


import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 12/13/12
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Visa {

    public boolean checkVisaCode(Predicate<Integer> pred, Integer param) {

        return pred.test(param);

    }
}
