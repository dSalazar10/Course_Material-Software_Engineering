import java.util.function.Predicate;

public class StringTest implements Predicate<String> {
    String key;

    public StringTest(String key) {
        this.key = key;
    }

    @Override
    public boolean test(String string) {
        return (key.compareTo(string) == 0) ? (true) : (false);
    }
}
