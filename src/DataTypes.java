import java.util.List;

public class DataTypes {

    public static long sum(List<Integer> numbers) {

        int s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (long x : numbers) {
            s += x;
        }
        return s;
    }
}
