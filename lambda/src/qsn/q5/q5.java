package qsn.q5;

import java.util.Arrays;
import java.util.List;

public class q5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "foo", "bar");

        String longestString = strings.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("");

        System.out.println("Longest string: " + longestString); // world
    }
}
