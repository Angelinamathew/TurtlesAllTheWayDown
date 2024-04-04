import org.junit.Test;
import static org.junit.Assert.*;

public class GDCtest {
    @Test
    public void testGdcNotNull(){
        GCD gcd = new GCD();
        assertNotNull(gcd);
    }
    @Test
    public void testGdc1(){
        GCD gcd = new GCD();
        int num1 = 1440;
        int num2 = 408;
        int expected = 24;
        int actual = gcd.recursion(num1, num2);
        assertEquals(expected, actual);
    }
    @Test
    public void testGdc2(){
        GCD gcd = new GCD();
        int num1 = 216;
        int num2 = 192;
        int expected = 24;
        int actual = gcd.recursion(num1, num2);
        assertEquals(expected, actual);
    }
}
