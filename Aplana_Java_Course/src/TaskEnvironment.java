/**
 * Created by gavalenik on 13.01.2016.
 */
public class TaskEnvironment {

    static Task1 tWalk1;
    static Task2 tWalk2;
    static Task3 tWalk3;
    static Task4 tWalk4;
    static Task5 tWalk5;
    static Task6 tWalk6;
    static Task7 tWalk7;
    static Task8 tWalk8;
    static Task9 tWalk9;
    static Task10 tWalk10;


    public static void main(String[] args) {

        System.out.println("!!!MNOGOPOTOK!!!");

        tWalk1 = new Task1();
        Thread myThready1 = new Thread(tWalk1);
        myThready1.start();

        tWalk2 = new Task2();
        Thread myThready2 = new Thread(tWalk2);
        myThready2.start();

        tWalk3 = new Task3();
        Thread myThready3 = new Thread(tWalk3);
        myThready3.start();

        tWalk4 = new Task4();
        Thread myThready4 = new Thread(tWalk4);
        myThready4.start();

        tWalk5 = new Task5();
        Thread myThready5 = new Thread(tWalk5);
        myThready5.start();

        tWalk6 = new Task6();
        Thread myThready6 = new Thread(tWalk6);
        myThready6.start();

        tWalk7 = new Task7();
        Thread myThready7 = new Thread(tWalk7);
        myThready7.start();

        tWalk8 = new Task8();
        Thread myThready8 = new Thread(tWalk8);
        myThready8.start();

        tWalk9 = new Task9();
        Thread myThready9 = new Thread(tWalk9);
        myThready9.start();

        tWalk10 = new Task10();
        Thread myThready10 = new Thread(tWalk10);
        myThready10.start();
    }
}