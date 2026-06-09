import java.util.*;

public class SetEg{
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Red");

        set.remove("Blue");

        System.out.println(set.contains("Green"));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        for (String s : set) {
            System.out.println(s);
        }

        set.clear();
        System.out.println(set);
    }
}