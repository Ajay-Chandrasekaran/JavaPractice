package learningstreams;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamOpTypes {
    public static void main(String[] args) {
        Stream<Integer> lst = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Predicate<Integer> p1 = i -> i > 3;
        Predicate<Integer> p2 = i -> i < 7;

        Stream<Integer> str2 = lst.peek(System.out::println)
                .filter(p1.and(p2))
                .peek(System.out::println);

        str2.forEach(System.out::println);
    }
}
