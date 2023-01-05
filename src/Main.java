import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        int[] payments = {132, 2442, 3422, 1234, 57989};
        int sum = 0;
        for( int i : payments) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила "+ sum + " рублей");
    }


}
