package thread;

import stream.Funcionario;

import javax.swing.*;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class TarefaConsultaPorNome implements Runnable {

    private String nomeBusca;
    private String nomeThread;
    private JFrame janela;

    public TarefaConsultaPorNome(String nomeBusca, String nomeThread, JFrame janela) {
        this.nomeBusca = nomeBusca;
        this.nomeThread = nomeThread;
        this.janela = janela;
    }

    @Override
    public void run() {
        buscaPorNome();
    }

    private void buscaPorNome() {
        Optional<List<Funcionario>> listaFuncionarios = ArquivoUtils.getListaFuncionarios();

        simularLentidao();
        for (Funcionario funcionario : listaFuncionarios.get()) {

            if (funcionario.getNome().equals(nomeBusca)) {
                System.out.println("\nFuncionario encontrado - " + nomeThread+ "\n");
                System.out.println(funcionario);
                //exibe janela caso queira
                //JOptionPane.showMessageDialog(janela, funcionario.getNome(),"\nFuncionario encontrado - " + nomeThread+ "\n", 1  );

                return;
            }
        }
        System.out.println("\n\nFuncionario nao encontrado " + nomeBusca + "  "+  nomeThread + "\n");
        //exibe janela caso queira
        //JOptionPane.showMessageDialog(janela,"\nFuncionario nao encontrado - " + nomeThread+ "\n"  );

    }

    private static void simularLentidao() {
        try {
            int randomico = new Random().nextInt(5,10);

            Thread.sleep(randomico* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
