package exemplo01;

public class AppExemplo01 {
    public static void main(String[] args) {
        Metodos m = new Metodos();

        m.metodo1();

        // não pode ser feito, pois o método não retorna um valor
        // System.out.println(m.metodo1());

        String retorno = m.metodo2();
        System.out.println(retorno);

        // m.metodo3();

        // m.metodo4();
        Metodos.metodo4();

        // Não é possível pois é privado
        // System.out.println(" Atributo interno" + m.atributoPrivate);
        // precisausar um método que devolve (Informa) o valor do atributo
        int valorDoAtributo = m.getAtributoPrivate();
        System.out.println("Atributo interno antes " + valorDoAtributo);
        
        m.setAtributoPrivate(15);
        valorDoAtributo = m.getAtributoPrivate();
        System.out.println("Atributo interno depois " + valorDoAtributo);
    }
}
