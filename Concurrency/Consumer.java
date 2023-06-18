package concurrency;

public class Consumer implements Runnable {
    private MessageQ mq;

    public Consumer(MessageQ mq) {
        this.mq = mq;
    }

    @Override
    public void run() {
        for (String msg = mq.get(); !msg.equals("QUIT"); msg = mq.get()) {
            System.out.format("MESSAGE RECIEVED: %s\n", msg);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}
