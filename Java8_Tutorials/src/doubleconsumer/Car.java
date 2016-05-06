package doubleconsumer;

import java.util.function.IntConsumer;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/2/13
 * Time: 12:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class Car {

    public void start(IntConsumer cons, int d) {
        cons.accept(d);
    }

    public static void main(String[] args) {

        Car car = new Car();

        // Cause DoubleConsumer returns void,
        // no need to { }
        car.start(e -> System.out.print("Release year: " + e), 2013);
    }
}
