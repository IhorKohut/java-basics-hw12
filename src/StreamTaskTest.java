import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StreamTaskTest {

    @DataProvider(name = "numbers")
    public static Object[][] numbers() {
        return new Object[][]{
                {
                        new int[]{1, 2, 3, 4, 5},
                        20
                },
                {
                        new int[]{-5, -4, 11, 6, 5},
                        52
                },
                {
                        new int[]{13, -2, 33, -4, 5},
                        20
                },
                {
                        new int[]{0, 2, 4, 6, 8},
                        120
                },
                {
                        new int[]{-1, 0, 15, 25, 35},
                        0
                }
        };
    }

    @DataProvider(name = "arrays")
    public static Object[][] arrays() {
        return new Object[][]{
                {
                        new int[]{1, 4, 3, 5, 2},
                        new int[]{1, 3, 5}
                },
                {
                        new int[]{5, -3, 11, -5},
                        new int[]{-5, -3, 5, 11}
                },
                {
                        new int[]{130, -200, 330, -40, 50, 66},
                        new int[]{}
                },
                {
                        new int[]{0, -1, 1, -2, 2},
                        new int[]{-1, 1}
                },
                {
                        new int[]{-99, 99, 0, -99, 99},
                        new int[]{-99, -99, 99, 99}
                }
        };
    }

    @Test(dataProvider = "numbers")
    public void testSumSquareEven(int[] numbers, int expectedResult) {
        assertEquals(StreamTask.getSumSquareEven(numbers), expectedResult, "Max value is incorrect");
    }

    @Test(dataProvider = "arrays")
    public void getSortedOddsArray(int[] numbers, int[] expectedResult) {
        assertEquals(StreamTask.getSortedOddsArray(numbers), expectedResult, "Array is incorrect");
    }
}
