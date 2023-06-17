package concurrency;

public class Concurrency1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            
            
            @Override
            public void run() {
                System.out.format("%s", "String");
            }
        };

        Thread t = new Thread(runnable);
        t.setName("New Runnable");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
