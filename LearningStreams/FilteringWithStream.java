package learningstreams;

import java.io.File;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilteringWithStream {
    public static void main(String[] args) {
        // Stream<String> str = Stream.of("ONE", "TWO", "THREE");
        // Predicate<String> p = (v) -> v.equals("TWO");
        // Stream<String> str2 = str.filter(p.and(Predicate.isEqual("TWO")));

        // str2.forEach(System.out::println);

        File f = new File("FilteringWithStream.java");
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.isAbsolute());
        System.out.println(f.getAbsolutePath());
    }
}
