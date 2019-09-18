package Task_4;

public class Moon {

    public static void main(String[] args) {
        String number_1 = "4561261212345467";
        String number_2 = "456126121234522";
        boolean check_1 = check(number_1);
        boolean check_2 = check(number_2);
        System.out.println(check_1);
        System.out.println(check_2);
    }

    static boolean check(String number) {
        int sum = 0;
        for (int i = 0; i <= number.length() - 1; i++) {
            int currentValue = Integer.parseInt(number.substring(i, i + 1));
            if ((i % 2 == 0 & number.length() % 3 != 0) || (i % 2 != 0 & number.length() % 3 == 0)) {
                currentValue *= 2;
                if (currentValue > 9) {
                    currentValue -= 9;
                }
            }
            sum += currentValue;
        }
        System.out.println("Сумма = " + sum);
        return (sum % 10 == 0);
    }


}
