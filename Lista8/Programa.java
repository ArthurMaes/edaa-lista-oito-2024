import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        String caminhoArquivo = "estudantes_una_2024.csv";
        try {
            File arquivo = new File(caminhoArquivo);
            Scanner scanner = new Scanner(arquivo);
            scanner.useDelimiter("\n");
            scanner.next();
            ArrayList<String> nomes = new ArrayList<String>();
            while (scanner.hasNext())
                nomes.add(scanner.next());
            Collections.sort(nomes);
            System.out.println("Ordenando Estudantes por nome:");
            for (String nome : nomes)
                System.out.printf("Nome: %s\n", nome);
            scanner.close();
        } catch (FileNotFoundException error) {
            System.err.println("O arquivo não foi encontrado");
            System.err.println("Caminho do arquivo: " + caminhoArquivo);
        }
    }
}