package exemplo01;

public class Metodos {

    private int atributoPrivate = 12;

    // Como declaramos um método:
    // visibilidade retorno nome( parâmetros )

    // void significa que ele não dá retorno
    public void metodo1() {
        System.out.println("metodo 1");
    }

    public String metodo2() {
        return ("metodo 2");
    }

    // só pode ser acionado dentro da classe

    private void metodo3() {
        System.out.println("metodo 3");
    }

    // static indica um método da CLASSE e não do objeto
    public static void metodo4() {
        System.out.println("metodo 4");
    }

    // informa (retorna) o valor do atributo
    public int getAtributoPrivate() {
        return atributoPrivate;
    }

    // apenas faz a ação e não precisa retornar nenhuma confirmação
    public void setAtributoPrivate(int novoValor) {
        if(novoValor > 0) {
            atributoPrivate = novoValor;
        }
    }

}
