package exercicios.contas;

public class ContasApp {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(123);

        System.out.println(c1);
        
        c1.depositar(100);
        System.out.println(c1);
        
        c1.sacar(50);
        System.out.println(c1);

        c1.sacar(500);
        System.out.println(c1);
        
        c1.sacar(-50);
        System.out.println(c1);
    }
}
