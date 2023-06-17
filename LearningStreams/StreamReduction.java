package LearningStreams;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String[] s = new String[] {"one", "two", "three"};
        

        // BinaryOperator<Integer> bo = (a, b) -> a + b;
        // Stream<Integer> str = Stream.of(1, 2, 3, 4, 5);

        IntStream str = Arrays.stream(arr);
        IntBinaryOperator io = (i1, i2) -> i1 + i2;

        int sum = str.reduce(0, io);
        System.out.println(sum);
    }
}
