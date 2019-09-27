package NaymushinIgor.specutils.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(12);
        numberList.add(132);
        numberList.add(555);


        GenNumber<List<Number>> listGenNumber = new GenNumber<>(numberList);
        System.out.println(listGenNumber.getAvg());
        System.out.println(listGenNumber.getMin());
        System.out.println(listGenNumber.getMax());



    }
}
