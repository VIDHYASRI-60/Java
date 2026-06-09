import java.util.*;

public class List{
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add(1, "Grapes");

        System.out.println(list.get(2));

        list.set(0, "Orange");

        list.remove("Banana");
        list.remove(1);

        System.out.println(list.size());
        System.out.println(list.contains("Mango"));
        System.out.println(list.isEmpty());

        for (String item : list) {
            System.out.println(item);
        }

        list.clear();
        System.out.println(list);
    }
}