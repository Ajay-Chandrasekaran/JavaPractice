package concurrency;

public class Producer implements Runnable {
    private MessageQ mq;

    public Producer(MessageQ mq) {
        this.mq = mq;
    }

    @Override
    public void run() {
        String[] messages = {
            "Have to prepare JAVA",
            "Have to prepare DSA",
            "Have to prepare Design patterns",
            "What have I done?"
        };

        for (int i=0; i<messages.length; i++) {
            this.mq.put(messages[i]);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
        }
        this.mq.put("QUIT");
    }
}
