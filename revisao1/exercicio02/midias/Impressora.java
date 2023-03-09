package exercicio02.midias;

public class Impressora implements Midia{
    
    @Override
    public void exibir(String mensagem) {
        System.out.println("Exibindo na Impresora:");
        System.out.println(mensagem);
    }

}
