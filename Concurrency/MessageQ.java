package concurrency;

public class MessageQ {
    private String message;

    // if True, then consumer waits
    // else, producer waits
    private boolean empty;

    public synchronized void put(String msg) {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        empty = true;
        this.message = msg;
        notifyAll();
    }

    public synchronized String get() {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        empty = false;
        notifyAll();
        return this.message;
    }
}
