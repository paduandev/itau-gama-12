package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int cont;

        cont = 1;

        while(cont < 10) {
            System.out.println(cont);
            // cont++; // cont = cont + 1;
            cont += 2; // cont = cont + 2;
        }

        System.out.println("FIM");
    }
}
