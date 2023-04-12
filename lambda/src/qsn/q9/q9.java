package qsn.q9;

import java.util.Arrays;
import java.util.List;

public class q9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        System.out.println("Max: " + max); // 5
        System.out.println("Min: " + min); // 1
    }
}

