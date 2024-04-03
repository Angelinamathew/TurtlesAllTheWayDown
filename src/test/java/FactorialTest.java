
import org.junit.Test;
import static org.junit.Assert.*;
public class FactorialTest {
    @Test
    public void testFactorialNotNull(){
        Factorial f = new Factorial();
        assertNotNull(f);
    }

    @Test
    public void testFactorialRecursion1() {
        Factorial f = new Factorial();
        int expected = 6;
        int actual = f.recursion(3);
        assertEquals(expected, actual);
    }
    @Test
    public void testFactorialRecursion2() {
        Factorial f = new Factorial();
        int expected = 120;
        int actual = f.recursion(5);
        assertEquals(expected, actual);
    }
}
