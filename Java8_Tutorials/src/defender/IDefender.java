package defender;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 11/20/12
 * Time: 9:47 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IDefender {

    public void likeIt(String s);


    public default void doIt() {
        System.out.println("doIt function..");
    }


}
