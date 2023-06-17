package learninginterfaces;

public interface Interface1 extends CharSequence {
    public default boolean returnTrue() {
        return true;
    }

    public boolean returnFalse();
}
