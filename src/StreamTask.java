import java.util.stream.IntStream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        int sum = IntStream.of(numbers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sum();
        return sum;
    }

    public static int[] getSortedOddsArray(int[] numbers) {

        return IntStream.of(numbers)
                .filter(x -> x % 2 == 1 || x % 2 == -1)
                .sorted()
                .toArray();
    }
}
