package learningstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class StreamOne {

    public static void myFunction(Integer i) {
        System.out.println(5 * i);
    }

    public static void myFunction2(Integer i) {
        // System.out.println(2 * i);
        // return 2 * i;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<Integer> list2 = new ArrayList<>();

        Consumer<Integer> c1 = StreamOne::myFunction;
        Consumer<Integer> c2 = list2::add;

        Stream<Integer> str = list.stream();
        str.forEach(c1.andThen(c2));

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
    }
}
