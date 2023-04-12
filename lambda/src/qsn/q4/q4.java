package qsn.q4;


import java.util.Arrays;
import java.util.List;


public class q4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average: " + average); // 3.0
    }
}
