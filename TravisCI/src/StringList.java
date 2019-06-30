import java.util.ArrayList;
import java.util.List;

public class StringList {
    private List<String> l = new ArrayList<String>();

    // Constructor
    public StringList(String[] list) {
        for (String i : list)
            this.l.add(i);
    }

    // Get List
    public List<String> getL() {
        return l;
    }
}
