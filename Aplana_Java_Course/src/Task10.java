import java.util.Calendar;

/**
 * Created by gavalenik on 10.01.2016.
 */
public class Task10 implements Runnable {

    public void run() {

        long sum=0;

        Calendar time_beg = Calendar.getInstance();         // �������� ����� �������
        for (int i = 2; i < 2000000; i++){
            if (Sub_class.isPrime(i) == true){
                sum += i;
            }
        }
        Sub_class.vivod_otcheta(10, time_beg, Calendar.getInstance(), sum); // ������ �����
    }
}
