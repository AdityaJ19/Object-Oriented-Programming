package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collect {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(23);
        list2.add(24);
        list2.add(34);
        list2.add(35);

        //It has inbuilt toStrings function
        System.out.println(list2);
    }
}
