package NaymushinIgor.structures.task_5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, TreeMap<String, Integer>> clients = new TreeMap<>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("1")) {
                break;
            }
            String[] parts = s.split(" ");
            String customerName = parts[0];
            String productName = parts[1];
            int count = Integer.parseInt(parts[2]);

            checkIsClientContain(clients, customerName);

            TreeMap<String, Integer> productsAndCount = clients.get(customerName);

            checkIsProductContains(productName, count, productsAndCount);
        }

        showClientsWithProducts(clients);
    }

    private static void checkIsClientContain(TreeMap<String, TreeMap<String, Integer>> clients, String customerName) {
        if (!clients.containsKey(customerName)) {
            clients.put(customerName, new TreeMap<>());
        }
    }

    private static void checkIsProductContains(String productName, int count, TreeMap<String, Integer> productsAndCount) {
        if (!productsAndCount.containsKey(productName)) {
            productsAndCount.put(productName, 0);
        }
        int oldCount = productsAndCount.get(productName);
        productsAndCount.put(productName, oldCount + count);
    }

    private static void showClientsWithProducts(TreeMap<String, TreeMap<String, Integer>> clients) {
        for(Map.Entry<String, TreeMap <String, Integer>> entry : clients.entrySet()) {
            String key = entry.getKey();
            TreeMap <String, Integer> value = entry.getValue();
            System.out.println(key + ":");
            for(Map.Entry<String,Integer> product : value.entrySet()) {
                String keyProduct = product.getKey();
                Integer valueProduct = product.getValue();
                System.out.println(keyProduct + " " + valueProduct);
            }
        }
    }
}
