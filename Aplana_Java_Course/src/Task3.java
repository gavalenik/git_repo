import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by gavalenik on 06.01.2016.
 */

public class Task3 implements Runnable {

    public void run() {

        long chislo = 600851475143L;
        int koren = (int) Math.sqrt(chislo) + 1;

        Calendar time_beg = Calendar.getInstance();         // �������� ����� �������
/*
        Sub_class del = new Sub_class();                    // ����� ������ �������� ��������� �����
        ArrayList<Long> massiv = new ArrayList<Long>();
        massiv = del.schitaem_deliteli(chislo);             // ������������ ������ � ����������
        for (int i = 0; i < massiv.size(); i++){
            System.out.println("Delitel #" + (i+1) + " = " + massiv.get(i));
        }
*/
        while (koren > 0){
            if (chislo % koren == 0) {
                if (Sub_class.isPrime(koren) == true) {     // �������� ����� �� ��������
                        break;
                }
            }
            koren--;
        }
        Sub_class.vivod_otcheta(3, time_beg, Calendar.getInstance(), koren); // ������ �����
    }
}