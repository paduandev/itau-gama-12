package exercicios.exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(6, 16, 3);

        System.out.println("Hora: " + relogio.getHora());
        System.out.println("Minuto: " + relogio.getMinuto());
        System.out.println("Segundo: " + relogio.getSegundo());

        System.out.println("----");
        relogio.exibir();
    }
}
