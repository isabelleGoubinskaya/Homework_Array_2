import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        int[] payments = {132, 2442, 3422, 1234, 57989};
        int sum = 0;
        for( int i : payments) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила "+ sum + " рублей");

        Integer[] spentDays = { 221, 2223, 982, 612762176, 127 };
        int min = Collections.min(Arrays.asList(spentDays));
        int max = Collections.max(Arrays.asList(spentDays));
        System.out.println("Минимальная сумма трат за день составила "+ min + " рублей");
        System.out.println("Максимальная сумма трат за день составила "+ max + " рублей");

        int[] payments2 = {132, 2442, 3422, 1234, 57989};
        int sum2 = 0;
        double average = 0;
        for( int i : payments2) {
            sum2 = sum2 + i;
        }
        average = sum2 /2;
        System.out.println("Средняя сумма трат за месяц составила "+ average + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int reverse = reverseFullName.length - 1; reverse >= 0; reverse--) {
            System.out.print(reverseFullName[reverse]);
        }
        System.out.println();
    }
}
