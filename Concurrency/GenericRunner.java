package concurrency;

import concurrency.PrivateConstructorClass.Builder;

class PrivateConstructorClass {
    public int number;

    private PrivateConstructorClass(int x) {
        this.number = x;
    }

    public int getInt() {
        return number;
    }

    public static class Builder {
        public PrivateConstructorClass build(int a) {
            return new PrivateConstructorClass(a);
        }
    }
}

public class GenericRunner {
    public static void main(String[] args) {
        Builder b = new Builder();
        PrivateConstructorClass p = b.build(5);
        System.out.println(p.getInt());
    }
}
