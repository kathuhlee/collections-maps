import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        Set<String> setDemo = new HashSet<>();
        //Performance is the best for this set
        //Random order

        setDemo.add("Hello");

        Set<String> setDemo2 = new TreeSet<>();
        //Slowest set for adding and retrieving data
        //All data is sorted

        setDemo2.add("World");

        Set<String> setDemo3 = new LinkedHashSet<>();
        //Faster than TreeSet and slower than HashSet
        //Maintain the order of insertion
        setDemo3.add("LinkedHashSet");

        Set<Integer> A = new HashSet<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);

        Set<Integer> B = new HashSet<>();
        B.add(4);
        B.add(5);
        B.add(6);
        B.add(7);

        //Union
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println(union);

        //Intersection
        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println(intersection);

        //Difference
        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println(difference);

    }
}