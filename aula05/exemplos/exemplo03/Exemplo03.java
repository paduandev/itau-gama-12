package exemplos.exemplo03;

public class Exemplo03 {
    public static void main(String[] args) {
        int numeros[] = new int[5];

        // numeros[0] = 12;
        // numeros[1] = 23;
        // numeros[2] = 34;
        // numeros[3] = 45;
        // numeros[4] = 56;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1 ;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
