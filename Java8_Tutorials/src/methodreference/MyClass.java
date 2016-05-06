package methodreference;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/2/13
 * Time: 9:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyClass {

    public static void main(String[] args) {
        // MyClass class' static access
        Runnable r1 = MyClass::staticWork;

        // MyClass object's access
        MyClass myClass = new MyClass();
        Runnable r2 = myClass::work;
    }

    // Same method signature with Runnable's run method => void ***()
    public static void staticWork() {
        System.out.println("-- Static method body --");
    }

    // Same method signature with Runnable's run method => void ***()
    public void work() {
        System.out.println("-- Non-Static method body --");
    }


}
