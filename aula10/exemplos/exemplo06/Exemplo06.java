package exemplos.exemplo06;

public class Exemplo06 {
    public static void main(String[] args)  {
        String texto = null;
        
        try {
            System.out.println(vogal(texto, 2));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }

    static boolean vogal(String frase, int posicao) throws Exception {
        char vogal = letra(frase, posicao);

        if(vogal == 'a' || vogal == 'e'|| vogal == 'i'||vogal == 'o'||vogal == 'u') {
            return true;
        }

        return false;
    }


    static char letra(String frase, int posicao) throws Exception {
        if(frase == null) {
            throw new Exception("O Texto é nulo.");
        }
        return frase.charAt(posicao);
    }
}
