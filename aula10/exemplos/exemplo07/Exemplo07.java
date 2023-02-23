package exemplos.exemplo07;

import java.io.File;
import java.io.IOException;

/* 
 * Manipulação de Arquivos em Java
 * 
 */

public class Exemplo07 {
    public static void main(String[] args) throws IOException {
        File file = new File("exemplos/exemplo07/arquivo01.txt");

        // if(file.exists()) {
        //     System.out.println("Existe? Sim" );
        // }else {
        //     System.out.println("Existe? Não" );
        // }

        // (condição) ? parte verdadeira : parte falsa
        // um if/else escrito em uma única linha
        System.out.println("Existe? " + (file.exists() ? "Sim" : "Não") );

        file.createNewFile();
        System.out.println("Existe? " + file.exists());
        System.out.println("Nome: " + file.getName());
        System.out.println("Caminho: " + file.getAbsolutePath());
        System.out.println("Pode ler? " + file.canRead());
        System.out.println("Pode gravar? " + file.canWrite());
        

        // Usando File para acessar dados de uma pasta
        File pasta = new File("exemplos/exemplo07");

        File [] arquivos = pasta.listFiles();

        System.out.println("Arquivos da pasta:");
        System.out.println(arquivos[0].getName());
        System.out.println(arquivos[1].getName());
    }
}
