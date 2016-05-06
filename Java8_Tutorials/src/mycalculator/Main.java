package mycalculator;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/1/13
 * Time: 8:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {

        // Integer's sum
        MyOwnCalculatorFI<Integer> myOwnCalculatorFI = (a, b) -> (a + b);

        Integer sum = myOwnCalculatorFI.calcIt(5, 5);

        System.out.println("Sum: " + sum);

        // String's sum
        MyOwnCalculatorFI<String> myOwnCalculatorFI1 = (e, f) -> (e + f);
        System.out.println("Adder: " + myOwnCalculatorFI1.calcIt("kodcu", "com"));

        // Double's power
        MyOwnCalculatorFI<Double> calculator2 = (a, b) -> (Math.pow(a, b));
        System.out.println("Integer's range: " + calculator2.calcIt(2D, 32D));
    }
}
