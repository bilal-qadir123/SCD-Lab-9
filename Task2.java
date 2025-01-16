import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTesting {
    public int square(int num) {
        return num * num;
    }

    public int countA(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }

    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public int factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }

    class SquareTest {
        @Test
        public void testSquare() {
            JUnitTesting obj = new JUnitTesting();
            int result = obj.square(5);
            assertEquals(25, result);
        }
    }

    class CountATest {
        @Test
        public void testCountA() {
            JUnitTesting obj = new JUnitTesting();
            int result = obj.countA("Java");
            assertEquals(2, result);
        }
    }

    class MaxTest {
        @Test
        public void testFindMax() {
            JUnitTesting obj = new JUnitTesting();
            int[] array = {1, 2, 3, 4, 5};
            int result = obj.findMax(array);
            assertEquals(5, result);
        }
    }

    class MinTest {
        @Test
        public void testFindMin() {
            JUnitTesting obj = new JUnitTesting();
            int[] array = {1, 2, 3, 4, 5};
            int result = obj.findMin(array);
            assertEquals(1, result);
        }
    }

    class OddTest {
        @Test
        public void testIsOdd() {
            JUnitTesting obj = new JUnitTesting();
            boolean result = obj.isOdd(3);
            assertTrue(result);
        }
    }

    class EvenTest {
        @Test
        public void testIsEven() {
            JUnitTesting obj = new JUnitTesting();
            boolean result = obj.isEven(4);
            assertTrue(result);
        }
    }

    class PrimeTest {
        @Test
        public void testIsPrime() {
            JUnitTesting obj = new JUnitTesting();
            boolean result = obj.isPrime(7);
            assertTrue(result);
        }
    }

    class FactorialTest {
        @Test
        public void testFactorial() {
            JUnitTesting obj = new JUnitTesting();
            int result = obj.factorial(5);
            assertEquals(120, result);
        }
    }

    @RunWith(Suite.class)
    @SuiteClasses({SquareTest.class, CountATest.class, MaxTest.class, MinTest.class, OddTest.class, EvenTest.class, PrimeTest.class, FactorialTest.class})
    public class AllTests {
    }
}
