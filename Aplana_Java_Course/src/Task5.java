import java.util.Calendar;

/**
 * Created by gavalenik on 07.01.2016.
 */
public class Task5 implements Runnable {

    public void run() {

        int counter = 0;
        long i = 20;

        Calendar time_beg = Calendar.getInstance();     // �������� ����� �������
        while (i > 0){
            if (i%20 == 0) {                                        // ����������� �������� 2,4,5,10
                if (i%19 == 0) {
                    if (i%18 == 0) {                                // ����������� �������� 2,9
                        if (i%17 == 0) {
                            if (i%16 == 0) {                        // ����������� �������� 2,4,8
                                if (i%15 == 0) {                    // ����������� �������� 3,5
                                    if (i%14 == 0) {                // ����������� �������� 2,7
                                        if (i%13 == 0) {
                                            if (i%12 == 0) {        // ����������� �������� 2,6
                                                if (i%11 == 0) {
                                                    break;          // �����. ����������� 2,3,4,5,6,7,8,9,10
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
/*          for (int j = 11; j <= 20; j++) {    // work method, but high method in 40 times fast
                if (i % j == 0) {
                    counter += 1;
                }
            }
            if (counter == 10) {
                break;
            }
            counter = 0;
*/
            i++;

        }
        Sub_class.vivod_otcheta(5, time_beg, Calendar.getInstance(), i); // ������ �����
    }
}
