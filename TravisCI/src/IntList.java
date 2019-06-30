import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IntList {
    private List<Integer> l = new ArrayList<Integer>();

    // Constructor
    public IntList(int[] list) {
        for (int i : list)
            this.l.add(i);
    }

    // Get List
    public List<Integer> getL() {
        return l;
    }
}
