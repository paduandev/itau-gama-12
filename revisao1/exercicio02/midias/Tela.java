package exercicio02.midias;

public class Tela implements Midia {

    @Override
    public void exibir(String mensagem) {
        System.out.println("Exibindo na Tela:");
        System.out.println(mensagem);
    }
    
}
