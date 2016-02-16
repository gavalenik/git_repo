import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by gavalenik on 07.01.2016.
 */
public class Task4 implements Runnable {

    private static String Polindrom(String x){          // �������� �� ���������

        int i, dlina, flag = 0;

        dlina = x.length();
        for(i=0; i < dlina/2; i++){
            if(x.charAt(i) == x.charAt(dlina - (i+1))){
            flag += 1;
            }
        }
        if(flag == dlina/2){
            return x;
        }
        else {
            return null;
        }
    }

    public void run() {

        ArrayList<String> proizved = new ArrayList<String>();
        ArrayList<String> temp = new ArrayList<String>();
        ArrayList<Integer> polindrom = new ArrayList<Integer>();

        Calendar time_beg = Calendar.getInstance();     // �������� ����� �������

        for (int i=999; i >= 100; i--){
            for (int j=i; j >= 100; j--){
                proizved.add(Integer.toString(i * j));  // ������� ������ ������������ � ������� String
            }
        }
        for (int i=0; i < proizved.size(); i++) {       // �������� ������ ������������ �� ����������
            temp.add(Polindrom(proizved.get(i)));       // ������� ��������� ������ �� ����������� � null-��������
        }
        for (int i=0; i < temp.size(); i++){            // ������� ������ ����������� �� ���������� ������
            if(temp.get(i) != null){                    // ��������� null-��������
                polindrom.add(Integer.valueOf(temp.get(i)));
            }
        }
        long[] poli = new long[polindrom.size()];         // �������� ������� ������ ��� ������ ArrayList � ������������
        for (int i = 0; i < poli.length; i++){          // �������������� ArrayList � ������� ������
            poli[i] = polindrom.get(i).intValue();
        }
        long max = Sub_class.Poisk_max(poli);            // ����������� ������� �� �������� � ��������� ������� ��-��
        Sub_class.vivod_otcheta(4, time_beg, Calendar.getInstance(), max); // ������ �����
    }
}