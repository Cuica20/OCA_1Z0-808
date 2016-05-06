package predicate;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 12/13/12
 * Time: 5:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {

        Visa visa = new Visa();

        boolean sonuc = visa.checkVisaCode(s -> (s >= 400), 405);

        System.out.println("Test result: " + sonuc);
    }
}
