package exemplos.exemplo10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo10 {
    public static void main(String[] args) throws IOException {
        File file = new File("exemplos/exemplo10/file.txt");
        FileWriter fWriter = new FileWriter(file);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        String texto = "Texto de exemplo";

        // grava usando um buffer de memória ao invés de gravar diretamente no disco
        // isso melhora o desempenho para o caso de gravação de grande volume de dados
        bWriter.write(texto);

        bWriter.close();
        fWriter.close();
    }
}
