package NaymushinIgor.specutils.task_1;

import java.util.List;

public class GenNumber<T extends List<Number>> {
    private T myList;

    public GenNumber(T myList) {
        this.myList = myList;
    }

    double getAvg() {
        double sum = 0.0;
        for (Number item : myList) {
            sum += item.doubleValue();
        }
        return sum / myList.size();
    }

    double getMax() {
        double maxItem = 0.0;
        for (Number item : myList) {
            double currentItem = item.doubleValue();
            if (currentItem > maxItem) {
                maxItem = currentItem;
            }
        }
        return maxItem;
    }

    double getMin() {
        double minItem = getMax();
        for (Number item : myList) {
            double currentItem = item.doubleValue();
            if (currentItem < minItem) {
                minItem = currentItem;
            }
        }
        return minItem;
    }

}
