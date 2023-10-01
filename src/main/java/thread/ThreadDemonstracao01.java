package thread;

import java.util.stream.Stream;

public class ThreadDemonstracao01 {

    public static void main(String[] args) {



        System.out.println("Hello World!");
        MinhaThread minhaThread1 = new MinhaThread("Thread Nova1");
        MinhaThread minhaThread2 = new MinhaThread("Thread Nova2");
        MinhaThread minhaThread3 = new MinhaThread("Thread Nova3");
        minhaThread1.start();
        minhaThread2.start();
        minhaThread3.start();



    }
}
