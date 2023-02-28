package exercicios.contas.excecao;

public class ContaInexistenteException extends Exception {

    public ContaInexistenteException(String msg) {
        super(msg);
    }
    
}
