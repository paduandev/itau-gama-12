package exemplos.exemplo03;

// A classe Tela, implementa a interface DispositivoSaida
// podemos gerar objetos do tipo Tela
// Podemos dizer que "Tela" <É UM> "DispositivoDeSaída"
public class Tela implements DispositivoSaida {
    // Override = anotação que indica sobrescrever o método
    @Override
    public void imprimir() {
        System.out.println("Exibindo na tela");
    }
}
