package methodreference;

import  java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CriacaoGrupos {
    public static List<List<String>> criarGrupos(List<String> nomes, int tamanhoMin, int tamanhoMax) {
        List<List<String>> grupos = new ArrayList<>();

        for (int i = 0; i < nomes.size(); i += tamanhoMin) {
            int fim = Math.min(i + (int)(Math.random() * (tamanhoMax - tamanhoMin + 1) + tamanhoMin), nomes.size());
            List<String> grupo = nomes.subList(i, fim);

            grupos.add(grupo);
        }

        return grupos;
    }

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Adir Silva Filho (Silva)");
        nomes.add("Bruno Godoi Eilliar");
        nomes.add("Camila Bregalda");
        nomes.add("Emanuel C. Montenegro");
        nomes.add("Helen Her");
        nomes.add("Joellyton Brenno");
        nomes.add("João Victor");
        nomes.add("Ligia Xavier");
        nomes.add("Lucas Rosa");
        nomes.add("Lucas Vanzella");
        nomes.add("Marianny Neris Ferreira");
        nomes.add("Matheus Lima de Oliveira");
        nomes.add("Matheus Vitor");
        nomes.add("Pedro Neres");
        nomes.add("Renato Magalhães");
        nomes.add("Tassio N Santos");
        nomes.add("Thales Souza Chagas");
        nomes.add("Victor Silva Camargo");
        nomes.add("Viny Pereira");
        nomes.add("Willian Barbosa");
        nomes.add("Leonardo Pereira");
        Collections.shuffle(nomes); // Embaralha a lista de nomes

        int tamanhoMin = 3;
        int tamanhoMax = 4;

        List<List<String>> grupos = criarGrupos(nomes, tamanhoMin, tamanhoMax);

        for (int i = 0; i < grupos.size(); i++) {
            System.out.println("Grupo " + (i + 1) + ": " + grupos.get(i));
        }
    }
}