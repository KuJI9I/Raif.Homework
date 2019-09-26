package NaymushinIgor.structures.task_3;

public class Main {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add("azaza");
        myList.add("Bazaza");
        myList.add("WAHAHHA55");
        myList.add("WAHAHHA");
        myList.add("123");
        myList.add("321");


        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }


        System.out.println("-----------------------------------------");
        System.out.println(myList.contains("WAHAHHA55"));
        System.out.println(myList.contains("321"));
        System.out.println("-----------------------------------------");

//        myList.remove("Bazaza");
//        myList.remove("azaza");
        myList.remove("321");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }


    }
}
