package learninglambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    
    public static void main(String[] args) {
        
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Comparator<String> compLambda = (String s1, String s2) -> Integer.compare(s2.length(), s1.length());

        List<String> strList = Arrays.asList("A", "AAA", "C", "BB", "EEEE", "TEQ");
        Collections.sort(strList, compLambda);

        for (String s: strList) {
            System.out.println(s);
        }
    }
}
