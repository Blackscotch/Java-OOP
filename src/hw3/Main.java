package hw3;

import java.util.ArrayList;

public class Main {
    // Это стандартное решение, нужно сделать норм
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("2");
        list.add("3");

        NewArrayList list2 = new NewArrayList();
        list2.add("2");
        list2.add("3");
        System.out.println(list.size());
        System.out.println(list2.size());
    }
}
