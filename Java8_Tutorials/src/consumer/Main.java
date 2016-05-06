package consumer;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 12/13/12
 * Time: 5:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main(String[] args) {
        Car car = new Car();

        // Data and Code stands same point
        car.sayBrand(e -> System.out.println("Car's Brand: " + e), "Audio A6");

    }
}
