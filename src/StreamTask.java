import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        int sum = IntStream.of(numbers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sum();
        return sum;
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        IntStream.of(numbers)
                .filter(x -> x % 2 == 1 || x % 2 == -1)
                //.forEach(System.out::println);
                .collect(Collectors.toList());

        // TODO replace return with your code
        return new int[]{};
    }
}
