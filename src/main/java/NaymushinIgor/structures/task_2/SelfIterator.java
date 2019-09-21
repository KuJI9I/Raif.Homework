package NaymushinIgor.structures.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class SelfIterator<T> implements Iterator {
    private ArrayList<T> myList;
    private int index = 0;

    SelfIterator(ArrayList<T> list) {
        myList = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= myList.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return myList.get(index++);
    }

    @Override
    public void remove() {
        System.out.println("До " + myList);
        myList.remove(--index);
        System.out.println("После " + myList);
    }

    @Override
    public void forEachRemaining(Consumer action) {
        if (action != null) {
            while (hasNext())
                action.accept(next());
        }
       else {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


