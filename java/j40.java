public class j40 {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("Thread running");
        });

        t.start();

        System.out.println("Main thread finished");
    }
}