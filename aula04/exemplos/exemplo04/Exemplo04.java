package exemplos.exemplo04;

public class Exemplo04 {
    public static void main(String[] args) {

        // int a = 10;
        // int b;

        // b = a;
        // b = 20;

        // System.out.println(a);
        // System.out.println(b);

        Relogio r1 = new Relogio(10, 0, 0);

        Relogio r2;
        
        r2 = r1;

        r2.setHora(20);

        r1.exibir();
        r2.exibir();
    }
}
