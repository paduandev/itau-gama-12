package exercicios.contas;

public class ContasApp {
    public static void main(String[] args) {
        ContaPoupanca c1 = new ContaPoupanca(123);

        System.out.println(c1);

        // método static chama a patir da classe
        ContaPoupanca.setTaxaSaque(0.1);
        
        c1.depositar(100);
        System.out.println(c1);
        
        if(c1.sacar(100)) {
            System.out.println("Sucesso");
            System.out.println(c1);
        } else {
            System.out.println("Não foi possível fazer o saque");
        }

        if(c1.sacar(99.9)) {
            System.out.println("Sucesso");
            System.out.println(c1);
        } else {
            System.out.println("Não foi possível fazer o saque");
        }
        
        c1.sacar(-50);
        System.out.println(c1);
    }
}
