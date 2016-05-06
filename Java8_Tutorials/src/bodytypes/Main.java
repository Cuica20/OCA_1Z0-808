package bodytypes;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 12/13/12
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {

        // No need ( ) and return
        MyIntegerCalculator myIntegerCalculator = (Integer s1) -> s1 * 2;

        System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(5));

        // OR
        // No need return
        myIntegerCalculator = (Integer s1) -> (s1 * 2);

        System.out.println("2- Result x2 : " + myIntegerCalculator.calcIt(5));

        // OR
        // Need  {} and "return" and ;
        myIntegerCalculator = (Integer s1) -> {
            return s1 * 2;
        };

        System.out.println("3- Result x2 : " + myIntegerCalculator.calcIt(6));
    }
}
