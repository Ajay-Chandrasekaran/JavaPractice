package concurrency;

public class ProducerConsumer {
    public static void main(String[] args) {
        MessageQ mq = new MessageQ();
        
        (new Thread(new Consumer(mq))).start();
        (new Thread(new Producer(mq))).start();
    }
}
