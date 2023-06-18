package concurrency;

public class AsyncCounter {
    public static class Counter {
        private int counter;

        public Counter() {
            this.counter = 0;
        }

        synchronized public void increment() {
            counter++;
        }

        synchronized public void decrement() {
            counter--;
        }

        synchronized public int getCounter() {
            return counter;
        }
    }

    public static class Runner implements Runnable{
        Counter c;

        public Runner(Counter c) {
            this.c = c;
        }

        @Override
        public void run() {
            for(int i=0; i<3; i++) {
                this.c.increment();
                System.out.format("From %s: %d\n",
                    Thread.currentThread().getName(),
                    this.c.getCounter()
                );
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter();
        Runner r1 = new Runner(c1);
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.setName("ONE");
        t2.setName("TWO");

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }
}
