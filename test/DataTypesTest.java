import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class DataTypesTest {

    @Test(timeout = 1000)
    public void largeSumTest() {
        long x = 500_000_500_000L;
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= 1_000_000; i++) {
            lst.add(i);
        }
        assertEquals("sum from 1 to 1 million should be " + x, x, DataTypes.sum(lst));
    }
}
