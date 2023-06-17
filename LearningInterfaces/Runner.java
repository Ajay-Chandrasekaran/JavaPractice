package learninginterfaces;

import learninginterfaces.Interface1;

class Solution implements Interface1 {

    @Override
    public boolean returnFalse() {
        return false;
    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }

    @Override
    public char charAt(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'charAt'");
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subSequence'");
    }

}

public class Runner {
    public static void main(String[] args) {
        Interface1 if1 = new Interface1() {
            @Override
            public boolean returnFalse() {
                return false;
            }

            @Override
            public int length() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'length'");
            }

            @Override
            public char charAt(int index) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'charAt'");
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'subSequence'");
            }
        };
        
        System.out.println(if1.returnFalse());
        System.out.println(if1.returnTrue());
    }
}
