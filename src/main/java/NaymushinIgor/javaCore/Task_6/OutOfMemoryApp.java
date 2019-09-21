package NaymushinIgor.javaCore.Task_6;

public class OutOfMemoryApp {

    public static void main(String[] args) {
        Integer[] array = new Integer[100000 * 100000];
        System.out.println(array.length);
    }

}
