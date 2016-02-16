import java.util.Calendar;

/**
 * Created by gavalenik on 10.01.2016.
 */
public class Task6 implements Runnable {

    public void run() {

        int sum = 0;
        long sum_kvad = 0;

        Calendar time_beg = Calendar.getInstance();     // �������� ����� �������
        for (int i= 1; i <= 100; i++){
            sum_kvad += Math.pow(i, 2);
            sum += i;
        }
        Sub_class.vivod_otcheta(6, time_beg, Calendar.getInstance(), (sum * sum - sum_kvad)); // ������ �����
    }
}
