package thread;


import stream.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class MultiThreadingConsultaNomes {
    private static int count = 0;
    public static void main(String[] args) {


        //recebe uma string nome
        //consulta na lista de funcionarios
        //imprime esse funcionario



        JFrame frame = new JFrame("Minha Janela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField nomeBusca = new JTextField(10);
        JButton button = new JButton("Clique Aqui");
        button.addActionListener(e -> {

            count++;

            if (nomeBusca.equals("1")) {
                System.exit(1);
            }
            String nomeThread = "## Thread ##" + count;

            TarefaConsultaPorNome tarefaConsultaPorNome = new TarefaConsultaPorNome(nomeBusca.getText(), nomeThread, frame);
            Thread thread = new Thread(tarefaConsultaPorNome);
            thread.start();

        });

        JPanel panel = new JPanel();
        panel.add(nomeBusca);
        panel.add(button);

        frame.getContentPane().add(panel, BorderLayout.BEFORE_FIRST_LINE);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);


       // Scanner scanner = new Scanner(System.in);
        /*while (true){



            System.out.println("Digite o nome do funcionario para consultar");
            nomeBusca = scanner.nextLine();

            if (nomeBusca.equals("1")) {
                System.exit(1);
            }
            String nomeThread = "## Thread ##" + i;

            TarefaConsultaPorNome tarefaConsultaPorNome = new TarefaConsultaPorNome(nomeBusca, nomeThread);
            Thread thread = new Thread(tarefaConsultaPorNome);
            thread.start();

            i++;
        }*/


    }


}
