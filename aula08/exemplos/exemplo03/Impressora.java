package exemplos.exemplo03;

public class Impressora implements DispositivoSaida {
    
    @Override
    public void imprimir() {
        System.out.println("Exibindo na impressora");
    }
    
}
