package NaymushinIgor.structures.task_3;

import java.util.*;
import java.util.function.UnaryOperator;

public class MyArrayList implements List {
    private final int MAX_SIZE = 100;
    private Object[] myList = new Object[MAX_SIZE];
    private int currentIndex = 0;


    @Override
    public boolean add(Object elem) {
        myList[currentIndex++] = elem;
        return true;
    }

    @Override
    public boolean remove(Object item) {
        boolean isRemove = false;
        for (int i = 0; i < currentIndex; i++) {
            if (item.equals(myList[i])) {
                myList[i] = null;
                currentIndex--;
                System.arraycopy(myList, i+1, myList, i, currentIndex);
                isRemove = true;
            } else isRemove = false;
        }
        return isRemove;
    }

    @Override
    public boolean contains(Object item) {
        boolean isContain = false;
        for (int i = 0; i < currentIndex; i++) {
            isContain = item.equals(myList[i]);
            if (isContain) {
                break;
            }
        }
        return isContain;
    }

    @Override
    public Object get(int index) {
        return myList[index];
    }


    @Override
    public int size() {
        return currentIndex;
    }


















    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public Object set(int index, Object element) {
        return null;
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {

    }

    @Override
    public void sort(Comparator c) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
