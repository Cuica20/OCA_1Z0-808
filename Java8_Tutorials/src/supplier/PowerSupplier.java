package supplier;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/2/13
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class PowerSupplier {

    public static SunPower produce(Supplier<SunPower> supp) {
        return supp.get();
    }

    public static void main(String[] args) {

        SunPower power = new SunPower();

        SunPower p1 = produce(() -> power);
        SunPower p2 = produce(() -> power);

        System.out.println("Check the same object? " + Objects.equals(p1, p2));

    }

    private static class SunPower {

        public SunPower() {
            System.out.println("Sun Power initialized..");
        }
    }
}
