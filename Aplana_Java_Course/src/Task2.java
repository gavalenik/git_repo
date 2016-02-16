/**
 * Created by gavalenik on 04.01.2016.
 */
public class Task2 implements Runnable {

    public void run() {

        int i = 3, summa = 0;
        int[] fibo = new int[100];

        fibo[1]=1;                      // ������ ��� �������� �������� ������
        fibo[2]=2;

        while (fibo[i-1] < 4000000){
            if (fibo[i-1] % 2 == 0) {
                summa+=fibo[i-1];
            }
            fibo[i] = fibo[i-2] + fibo[i-1];    // ����������� ����. ��-�� ��� ����� 2-� ����������
            i++;
        }
        System.out.println("Summa chetnih elementov rjada Fibonachchi ot 1 do 4.000.000 = " + summa);
    }
}