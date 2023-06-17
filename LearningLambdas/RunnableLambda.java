package learninglambdas;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        
        // Runnable runnable = new Runnable() {

        //     @Override
        //     public void run() {
        //         for (int i=0; i<3; i++) {
        //             System.out.println("Thread : " + Thread.currentThread().getName());
        //         }
        //     }
        // };
        
        // Thread newThread = new Thread(runnable);

        Runnable runnable = () -> {
            for (int i=0; i<3; i++) {
                System.out.println("Thread : " + Thread.currentThread().getName());
            }
        };

        Thread newThread = new Thread(runnable);

        newThread.setName("lambda");
        newThread.start();
        newThread.join();
    }
}
