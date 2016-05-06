package defender;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/2/13
 * Time: 6:01 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IExtendedDefender extends IDefender {

    public default void doIt() {
        System.out.println("my extended doIt function..");
    }
}
