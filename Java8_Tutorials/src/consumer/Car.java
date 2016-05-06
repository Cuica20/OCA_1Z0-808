package consumer;

import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 12/13/12
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Car {

    public void sayBrand(Consumer<String> block, String param) {
        block.accept(param);
    }
}
