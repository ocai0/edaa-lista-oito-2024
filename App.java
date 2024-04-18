import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            File arquivo = new File("estudantes_una_2024.csv");
            Scanner scanner = new Scanner(arquivo);
            scanner.useDelimiter("\n");
            scanner.next();
            ArrayList<String> nomes = new ArrayList<String>();
            while(scanner.hasNext())
                nomes.add(scanner.next());
            Collections.sort(nomes);
            System.out.println("Ordenando Estudantes por nome:");
            for(String nome : nomes) System.out.printf("Nome: %s\n", nome);
            scanner.close();
        }
        catch(FileNotFoundException error) {
            System.err.println("O arquivo não foi encontrado");
        }
    }
}