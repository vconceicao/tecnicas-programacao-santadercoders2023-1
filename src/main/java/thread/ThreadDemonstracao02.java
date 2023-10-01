package thread;

import java.util.List;

public class ThreadDemonstracao02 {

    public static void main(String[] args) {


        List<MinhaTarefa> minhaTarefas = List.of(new MinhaTarefa("##Thread 1"), new MinhaTarefa("##Thread 2 ")
                , new MinhaTarefa("##Thread 3"));

        for (MinhaTarefa minhaTarefa : minhaTarefas) {
            Thread thread = new Thread(minhaTarefa);
            thread.start();

        }

    }
}
