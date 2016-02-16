/**
 * Created by gavalenik on 04.01.2016.
 */
public class Task1 implements Runnable {

    public void run() {

        int summa = 0;
        for (int chislo = 1; chislo < 1000; chislo++){
            if (chislo % 3 == 0) {
                summa += chislo;
            }
            else {
                if (chislo % 5 == 0) {
                    summa += chislo;
                }
            }
        }
        System.out.println("Summa chisel kratnih 3 ili 5 v predelah ( 1 - 1000 ) = " + summa);
    }
}