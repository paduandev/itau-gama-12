package exercicio01;


public class CelularPrePago {
    private String cliente;
    private String telefone;
    private double saldo;
    
    // Pomorfismo: Sobrecarga (Overload) 
    public CelularPrePago(String telefone) {
        setTelefone(telefone);
        this.cliente = "Não registrado"; // poderia ser diexado em branco também , de acordo com o enunciado
    }

    public CelularPrePago(String cliente, String telefone, double saldo) {
        this.cliente = cliente;
        setTelefone(telefone);
        if(saldo > 0) {
            this.saldo = saldo;
        }
    }

    // colocar o método como privado faz com que ele não possa ser usado
    // fora da classe. o enunciado pede para não ter o método
    // mas criamos para evitar a repetiação da regra nos dois construtores
    // e deixamos "oculto" como privado
    private void setTelefone(String telefone) {
        if(telefone != null && telefone.length() > 0) {
            this.telefone = telefone;
        }
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CelularPrePago [cliente=" + cliente + ", telefone=" + telefone + ", saldo=" + saldo + "]";
    }
    
    // public void fazerLigacao() {
    //     if(saldo >= 0.75) {
    //         saldo -= 0.75;
    //         System.out.println("Ligação realizada");
    //     } else {
    //         System.out.println("Saldo insuficiente");
    //     }
    // }
    
    public boolean fazerLigacao() {
        if(saldo >= 0.75) {
            saldo -= 0.75;
            return true;
        }
        return false;
    }

    public double recarregar(double valor) {
        if(valor > 0) {
            saldo += valor;
            return saldo;
        }
        // o valor passado no parâmetro é incorreto e não é possível atualizar o saldo
        return -1; // -1 é uma escolha do programador para indicar erro, já que o retorno deve ser um número
    }
    
}