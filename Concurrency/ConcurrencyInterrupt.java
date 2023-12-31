package concurrency;

public class ConcurrencyInterrupt {

    public static class Sleeper implements Runnable {
        @Override
        public void run() {
            String[] messages = new String[]{
                "First Message",
                "Second Message",
                "Third Message",
                "Fourth Message",
            };

            for (int i=0; i<messages.length; i++) {
                System.out.format("Message from: %s \n Message: %s\n----\n",
                    Thread.currentThread().getName(),
                    messages[i]
                );

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.out.format("%s\n", "Ok! TERMINATED");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new Sleeper());
        t.setName("Sleeper");
        t.start();

        System.out.println("Waiting 6 seconds");
        Thread.sleep(6000);
        System.out.println("Done waiting.... Interrupting");
        if (t.isAlive()) {
            t.interrupt();
        }
        t.join();
        System.out.println("DONE!!");
    }
}
