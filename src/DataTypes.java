import java.util.ArrayList;
import java.util.List;

public class DataTypes {

    public static long sum(List<Integer> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int i: numbers) {
            //System.out.println(numbers.get(i));
            s += i;
        }
        return s;
    }

}
