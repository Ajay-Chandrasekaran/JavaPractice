package concurrency;

public class GuardedBlocks {

    public static class Runner1 implements Runnable {
        private boolean flag;


        @Override
        public void run() {
            // TODO Auto-generated method stub
            
        }
    }
    public static class Runner2 implements Runnable {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            
        }
    }
    public static void main(String[] args) {
        GuardedBlocks gB = new GuardedBlocks();
    }
}