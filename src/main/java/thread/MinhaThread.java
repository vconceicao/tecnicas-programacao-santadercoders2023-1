package thread;

public class MinhaThread extends Thread {


    public MinhaThread(String name) {
        super.setName(name);
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 1; i < 7; i++) {

            System.out.println("Hello world " + super.getName() + " numero de execucoes "+ i );
        }
    }
}
