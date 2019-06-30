import java.util.function.Predicate;

public class IntTest implements Predicate<Integer> {
    Integer key;

    public IntTest(Integer key) {
        this.key = key;
    }

    @Override
    public boolean test(Integer integer) {
        return (key.compareTo(integer) == 0) ? (true) : (false);
    }
}
