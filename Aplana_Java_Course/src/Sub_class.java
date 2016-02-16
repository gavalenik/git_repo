import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by gavalenik on 07.01.2016.
 */
public class Sub_class {

    public static void insertFile(String text, int x) {        // vivod v file

        try (FileWriter writer = new FileWriter("C:\\" + "Task_" + Integer.toString(x) + "_otchet.txt", true)) {
            writer.write(text + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void endTaskInFile(int x) {                // vivod v file line ========================
        try (FileWriter writer = new FileWriter("C:\\" + "Task_" + Integer.toString(x) + "_otchet.txt", true)) {
            writer.write("====================End_Task_#_" + Integer.toString(x) + "====================" + '\n' + '\n' + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList schitaem_deliteli(long del) {  // ����� �� �������� ��������� �����

        ArrayList<Long> deliteli = new ArrayList<Long>();

        long polovina = del / 2;
        while (polovina > 0) {
            if (del % polovina == 0) {
                deliteli.add(polovina);
            }
            polovina--;
        }
        deliteli.add(0,del);
        return (deliteli);
    }

    public static boolean isPrime(long del) {       // �������� ����� �� ��������

        if (del == 2){return true;}                 // ���������� ��� ����� 2

        long koren = (long) Math.sqrt(del) + 1;     // ��������� ���������� ������ �� ���������
        int i = 0;

        while (koren > 0) {                          // � ����� ������������ ����� �� �����. ����� ����
            if (del % koren == 0) {
                i += 1;                             // ���� ����� �������, �� ������� ���������� �� 1
            }
            koren--;
        }
        if (i == 1) {                                // ���� ����� ������� ������������ true
            return true;
        }
        else {                                      // ���� ����� �� ������� ������������ false
            return false;
        }
    }

    public static Long Poisk_max(long[] massiv){       // ���������� ������� �� ��������

        for(int i=0; i < massiv.length; i++) {
            for (int j = i + 1; j < massiv.length; j++)
                if (massiv[j] > massiv[i]) {
                    long temp = massiv[i];
                    massiv[i] = massiv[j];
                    massiv[j] = temp;
                }
        }
        return massiv[0];                                 // ��������� ������ ������� �������
    }

    public static long getProcessTime(Calendar beg, Calendar end) {      // ������ ������� ������

        return end.getTimeInMillis() - beg.getTimeInMillis();
    }

    public static void vivod_otcheta(int x, Calendar time_beg, Calendar time_end, long answer) { //�����

        String zagolovok = null, otvet = null;

        switch (x){
            case 3: zagolovok = "Task3. Ishem samii bolshoi prostoi delitel chisla 600851475143";
                    otvet = "MAX prostoi delitel chisla ( 600851475143 ) = ";
                break;
            case 4: zagolovok = "Task4. Ishem samii bolshoi polindrom sredi prizvedenii 3-hznachnih chisel";
                    otvet = "Max polindrom = ";
                break;
            case 5: zagolovok = "Task5. Ishem samoe malenkoe chislo, kotoroe delitsja na 1-20 bez ostatka";
                    otvet = "Chislo = ";
                break;
            case 6: zagolovok = "Task6. Ishem raznost mezhdu kvadratom summi i summoi kvadratov chisel 1-100";
                    otvet = "Raznost = ";
                break;
            case 7: zagolovok = "Task7. Ishem 10001-e prostoe chislo";
                    otvet = "10001-e prostoe chislo = ";
                break;
            case 8: zagolovok = "Task8. Ishem naibolshee proizvedenie 13 posledovatelnih chisel";
                    otvet = "MAX proizvedenie 13 posledovatelnih chisel = ";
                break;
            case 9: zagolovok = "Task9. Ishem troiku Pifagora, dlja kotoroi a+b+c = 1000";
                    otvet = "Chisla a, b, c naideni! a * b * c = ";
                break;
            case 10: zagolovok = "Task10. Ishem summu vseh prostih chisel < 2.000.000";
                     otvet = "Summa vseh prostih chisel < 2.000.000 = ";
                break;
        }
        System.out.println(zagolovok);
        insertFile(zagolovok, x);                                                                      // ���� ��������� � ����
        System.out.println();
        insertFile("", x);                                                                             // ������� �� ��. ������ � �����
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SSS z");
        System.out.println("Time begin work code = " + dateFormat.format(time_beg.getTime()));      // ���� � �������
        insertFile("Time begin work code = " + dateFormat.format(time_beg.getTime()), x);              // ���� � ����
        System.out.println("Time end work code = " + dateFormat.format(time_end.getTime()));
        insertFile("Time end work code = " + dateFormat.format(time_end.getTime()), x);
        System.out.println("Time delta work code (ms) = " + getProcessTime(time_beg, time_end));    // ������ ������� ������
        insertFile("Time delta work code (ms) = " + getProcessTime(time_beg, time_end), x);
        System.out.println();
        insertFile("", x);
        System.out.println(otvet + answer);
        insertFile(otvet + answer, x);
        insertFile("", x);
        endTaskInFile(x);
    }
}