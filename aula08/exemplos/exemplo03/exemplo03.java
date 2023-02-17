package exemplos.exemplo03;

public class exemplo03 {
    public static void main(String[] args) {
        // não pode ser feito pois interface não pode gerar objeto
        // DispositivoSaida d = new DispositivoSaida();

        // podemos gerar objetos do tipo Tela
        Tela tela = new Tela();
        // podemos gerar objetos do tipo Impressora
        Impressora imp = new Impressora();


        // Se Tela e Impressoa são DispositivosSaida
        // Podemos usar DispositivoSaida como referência
        // para os dois
        DispositivoSaida d1 = new Impressora();
        DispositivoSaida d2 = new Tela();

        tela.imprimir();
        imp.imprimir();

        d1.imprimir();
        d2.imprimir();

        Pessoa pessoa = new Pessoa();

        System.out.println("Exibindo dados da pessoa:");
        pessoa.exibirDados(tela);
        pessoa.exibirDados(imp);
    }
}
