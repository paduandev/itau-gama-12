package exercicios.contas;

public class ContasApp {
    public static void main(String[] args) {
        Conta c1 = new Conta(123);

        System.out.println(c1);
        
        c1.depositar(100);
        System.out.println(c1);
        
        c1.sacar(50);
        System.out.println(c1);
        
        c1.sacar(-50);
        System.out.println(c1);
    }
}
