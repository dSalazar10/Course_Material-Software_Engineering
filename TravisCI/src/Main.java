import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Create a List<String> and a List<Integer>
        StringList stringTest = new StringList(new String[]{"a", "b", "c", "d", "e", "f", "g"});
        IntList intTest = new IntList(new int[]{1, 3, 5, 7, 9, 11, 13, 15});

        // Using each list for at least one case, demonstrate you can:
        //
        //find a match in the first position
        System.out.println(linearSearch(stringTest.getL(), new StringTest("a")));
        System.out.println(linearSearch(intTest.getL(), new IntTest(1)));

        //something other than the first position
        System.out.println(linearSearch(stringTest.getL(), new StringTest("f")));
        System.out.println(linearSearch(intTest.getL(), new IntTest(7)));

        //handle not finding a match
        System.out.println(linearSearch(stringTest.getL(), new StringTest("z")));
        System.out.println(linearSearch(intTest.getL(), new IntTest(2)));
    }
    // steps through the elements of the list and
    // returns the index of the first element that satisfies the Predicate parameter
    public static <T> int linearSearch(List<T> list, Predicate<T> check) {
        for(int i = 0; i < list.size(); ++i) if(check.test(list.get(i))) return i;
        return -1;
    }
}

