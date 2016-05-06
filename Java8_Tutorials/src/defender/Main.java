package defender;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 11/20/12
 * Time: 9:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        IExtendedDefender def = (s) -> {
            System.out.println("likeIt method inherited from IDefender: " + s);
        };
        def.doIt();
        def.likeIt("I like the IExtended..");
    }
}
