package exemplos.exemplo05;

public class Exemplo05 {
    public static void main(String[] args) {
        String texto = null;

        // Como 'letra' dispara uma exception, precisa usar um try/catch
        try {
            System.out.println(letra(texto, 2));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        

    }

    // throws indica (declara) que esse método lança uma excetion e isso
    // deve (obrigatório) ser tratado pelo método (main) que chama o método letra
    static char letra(String frase, int posicao) throws Exception {
        if(frase == null) {
            // throw dispara uma Exception (pode ser de qualquer tipo)
            // Neste caso,é uma Exception genérica
            throw new Exception("O Texto é nulo.");
        }
        return frase.charAt(posicao);
    }
}
