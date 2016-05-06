package function;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/2/13
 * Time: 12:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        String result = calculator.calc((a) -> "Result: " + (a * 2), 10);

        System.out.println(result);
    }
}
