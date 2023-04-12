package qsn.q7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class q7 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "hello", "foo", "bar", "world");

        Map<String, Long> frequencyMap = strings.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(frequencyMap); // {bar=1, foo=1, world=2, hello=2}
    }
}
