package exercicios.contas.excecao;

// Como criar nossa própria Exception

public class ValorInvalidoException extends Exception {

    public ValorInvalidoException(String msg) {
        super(msg);
    }
    
}
