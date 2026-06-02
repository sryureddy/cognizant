import java.util.concurrent.*;

public class j41 {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Callable<Integer> task1 = () -> 10 + 20;
        Callable<Integer> task2 = () -> 30 + 40;

        Future<Integer> f1 = service.submit(task1);
        Future<Integer> f2 = service.submit(task2);

        System.out.println("Result 1: " + f1.get());
        System.out.println("Result 2: " + f2.get());

        service.shutdown();
    }
}