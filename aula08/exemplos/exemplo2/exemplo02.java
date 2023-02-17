package exemplos.exemplo2;

public class exemplo02 {
    public static void main(String[] args) {
        // não é possível pois a classe é abstrata, não pode gerar objeto Pessoa
        // Pessoa p = new Pessoa();

        Aluno a = new Aluno();
        a.setNome("João");
        a.setNumero(123);
        System.out.println(a.getNome() + " - " + a.getNumero());

        // Isso pode, pois o objeto é Aluno, não objeto Pessoa
        Pessoa p = new Aluno();

        // Exemplo de casting de double para int
        int numero = (int) 4.5;

        p.setNome("João"); 
        // p.setNumero(123); // não foi possível pois o método setNumero não existe em Pessoa
        // fazemos um casting (transformação) para podser usar um método específico da classe
        // transforma do tipo Pessoa para o tipo Aluno

        System.out.println( p.getDados() );

        Aluno temp = (Aluno) p;
        temp.setNumero(123);
        System.out.println(temp.getNome() + " - " + temp.getNumero());
    }
}
