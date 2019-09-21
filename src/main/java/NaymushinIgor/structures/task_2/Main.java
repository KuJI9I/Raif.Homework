package NaymushinIgor.structures.task_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        ArrayList<String> intList = new ArrayList<>();
        intList.add("1");
        intList.add("2");
        intList.add("3");
        SelfIterator selfIterator1 = new SelfIterator(stringList);
        SelfIterator selfIterator2 = new SelfIterator(intList);

        System.out.println("stringList elements : ");
        while (selfIterator1.hasNext()) {
            System.out.print(selfIterator1.next() + " ");
        }
        System.out.println();


        System.out.println("intList elements : ");
        while (selfIterator2.hasNext()) {
            System.out.println(selfIterator2.next() + " ");
            selfIterator2.remove();
        }
        System.out.println();
    }
}
