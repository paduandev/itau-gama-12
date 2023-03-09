package exemplo02;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppExemplo02 {
    public static void main(String[] args) {
        int vetorInt[] = new int[10];

        vetorInt[0] = 1;
        vetorInt[1] = 2;
        vetorInt[2] = 3;

        for (int i = 0; i < vetorInt.length; i++) {
            System.out.print(vetorInt[i] + " ");
        }

        System.out.println();

        ArrayList<Integer> arrayInt = new ArrayList<>();

        arrayInt.add(1);
        arrayInt.add(2);
        arrayInt.add(3);

        for (int i = 0; i < arrayInt.size(); i++) {
            System.out.print(arrayInt.get(i) + " ");
        }

        System.out.println();
        for (Integer numero : arrayInt) {
            System.out.print(numero + " ");
        }
        
        System.out.println();
        System.out.println(vetorInt);
        System.out.println(arrayInt);

        Pessoa vetorPessoas[] = new Pessoa[10];
        vetorPessoas[0] = new Pessoa("Ana");
        vetorPessoas[1] = new Pessoa("Bia");
       
        vetorPessoas[0] = null;

        for (int i = 0; i < vetorPessoas.length; i++) {
            System.out.print(vetorPessoas[i] + " ");
        }

        System.out.println();

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana"));
        pessoas.add(new Pessoa("Bia"));

        pessoas.remove(0);
        System.out.println("0: " + pessoas.get(0));

        for (Pessoa pessoa : pessoas) {
            System.out.print(pessoa + " ");
        }

        System.out.println();

        LinkedList<Pessoa> listaPessoas = new LinkedList<>();

        Pessoa p = new Pessoa("Gilberto");
        listaPessoas.add(p);

        System.out.println(listaPessoas);
    }
}
