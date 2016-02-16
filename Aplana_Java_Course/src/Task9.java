import java.util.Calendar;

/**
 * Created by gavalenik on 10.01.2016.
 */
public class Task9 implements Runnable {

    public void run() {

        long a = 0, b = 0, c = 0;

        Calendar time_beg = Calendar.getInstance();         // сохраняю время запуска

    label:
        for (a = 5; a < 500; a++) {
            for (b = 5; b < 500; b++) {
                double c1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                c = (int)c1;
                if (c1 % c == 0){                           // проверяю, что с1 целое число
                    if ((a + b + c) == 1000) {
                        break label;
                    }
                }
            }
        }

        Sub_class.vivod_otcheta(9, time_beg, Calendar.getInstance(), (a * b * c)); // вывожу отчет
    }
}
