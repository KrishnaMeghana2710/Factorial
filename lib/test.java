package lib;
import factorial.factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, factorial.calculateFactorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, factorial.calculateFactorial(1));
    }

    @Test
    public void testFactorialOfSmallNumber() {
        assertEquals(6, factorial.calculateFactorial(3));
    }
}
