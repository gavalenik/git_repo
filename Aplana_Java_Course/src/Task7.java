import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by gavalenik on 10.01.2016.
 */
public class Task7 implements Runnable {

    public void run() {

        int i = 1;
        long j = 3;
        ArrayList<Long> massiv = new ArrayList<Long>();

        Calendar time_beg = Calendar.getInstance();     // �������� ����� �������
        massiv.add(j-1);                                // �� ������ ����� ������� ���� "2"
        while (i <= 10001){                             // i - ������� ������� �����
            while (j > 0){                              // j - ������� ����� ����� � ����� +2, �������� � ����� 3
                if (Sub_class.isPrime(j) == true){
                    massiv.add(j);
                    i++;
                    j += 2;
                    break;
                }
                j += 2;
            }
        }
        Sub_class.vivod_otcheta(7, time_beg, Calendar.getInstance(), massiv.get(10000)); // ������ �����
    }
}
