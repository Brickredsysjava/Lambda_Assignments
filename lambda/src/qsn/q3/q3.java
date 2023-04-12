package qsn.q3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class q3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 7, 1, 8, 4);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedNumbers); // [8, 7, 5, 4, 2, 1]
    }
}


