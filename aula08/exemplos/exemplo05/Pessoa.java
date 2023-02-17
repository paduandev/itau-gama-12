package exemplos.exemplo05;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // toString é da classe Object
    // A classe Object é SUPER de todas as classes do Java
    // Ela é usada para representar em forma de String um objeto
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + "]";
    }

    // Vamos criar um método para dizer como devem ser comprados
    // dois objetos desta classe
    @Override
    public boolean equals(Object obj) {
        // this = referência para o próprio objeto
        // obj = referência para o outro objeto que vou comparar

        // Compara para ver se as duas referências apontam para mesmo objeto
        if (this == obj)
            return true;
        
        // verifica se o outro objeto existe
        if (obj == null)
            return false;
        
        // verifica se as classes dos dois objetos é diferente
        if (getClass() != obj.getClass())
            return false;
        
        // converte o tipo Object para o tipo Pessoas
        Pessoa other = (Pessoa) obj;

        // verifica se o atribuito 'nome' deste objeto (this) existe
        if (this.nome == null) {
            if (other.nome != null) // se o nome do outro objeto não existe
                return false;
        } else if (!nome.equals(other.nome)) // se os nomes são iguais
            return false;

        return true;// se chegou até aqui, eles são considerados iguais
    }

   
}
