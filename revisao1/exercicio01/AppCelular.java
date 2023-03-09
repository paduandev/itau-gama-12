package exercicio01;

public class AppCelular {
    public static void main(String[] args) {
        CelularPrePago celular1 = new CelularPrePago("11111");
        CelularPrePago celular2 = new CelularPrePago("Marcelo", "22222", 10);

        System.out.println(celular1);
        System.out.println(celular2);

        if (celular1.fazerLigacao()) {
            System.out.println("Ligação realizada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        if (celular2.fazerLigacao()) {
            System.out.println("Ligação realizada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo após a ligação: R$ " + celular2.getSaldo());

        double novoSlado = celular1.recarregar(0);
        if (novoSlado > 0) {
            System.out.println("Novo Saldo:" + novoSlado);
        } else {
            System.out.println("Erro ao fazer a recarga.");
        }

        novoSlado = celular1.recarregar(10);
        if (novoSlado > 0) {
            System.out.println("Novo Saldo:" + novoSlado);
        } else {
            System.out.println("Erro ao fazer a recarga.");
        }

    }
}
