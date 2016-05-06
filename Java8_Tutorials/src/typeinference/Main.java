package typeinference;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/2/13
 * Time: 9:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {


        Runnable r1 = (Runnable) () -> { /*body*/ };

        // equals
        // No need casting
        Runnable r2 = () -> { /*body*/ };


    }
}
