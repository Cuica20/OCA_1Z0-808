package executors;

import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/1/13
 * Time: 9:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ex = Executors.newSingleThreadExecutor();


        Future<Integer> future =
                // This Lambda evaluated to Callable<Integer>
                ex.submit(() -> ThreadLocalRandom.current().nextInt(1, 10));


        System.out.println("Randomized value: " + future.get());

    }
}
