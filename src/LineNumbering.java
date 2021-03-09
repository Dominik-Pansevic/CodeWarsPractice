import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineNumbering {

    public static void main(String[] args) {
        number(Arrays.asList("a", "b", "c"));
    }

    public static List<String> number(List<String> lines) {
        ArrayList<String> result = new ArrayList<String>(lines);

        for(int i=0; i<result.size(); i++) {
            result.set(i, (i+1 + ": " + result.get(i)));
            System.out.println(result.get(i));
        }

        return result;
    }
}
