package exercicios.exercicio01;

import java.util.LinkedList;
import java.util.Queue;

public class FilaPrioridade {
    private Queue<Pessoa> filaNormal;
    private Queue<Pessoa> filaPrioridade;
    private int atendimento;

    // construtor é um método especial, usado para inicializar o objeto
    public FilaPrioridade() {
        filaNormal = new LinkedList<>();
        filaPrioridade = new LinkedList<>();
        atendimento = 0;
    }

    public void inserir(String nome, int senha, boolean prioridade) {
        Pessoa pessoa = new Pessoa(nome, senha);

        if(prioridade) {
            filaPrioridade.add(pessoa);
        } else {
            filaNormal.add(pessoa);
        }
    }

    // remover 1 normal a cada 2 prioridade
    public Pessoa remover() {
        // System.out.println("Atendendo: " + atendimento);

        // para remover da fila, ela nõ pode estar vazia 
        if(atendimento < 2 && !filaPrioridade.isEmpty()) { // 0 ou 1 indica atendimento de prioridade
            atendimento++;
            return filaPrioridade.remove(); // remove da fila de Prioridade
        } else { // 2 indica atendimento Normal
            atendimento = 0;
            return filaNormal.remove();
        }
    }

    // A fila de prioridade estará vazia, quando as duas fulas estiverem vazias
    public boolean estaVazia() {
        return filaNormal.isEmpty() && filaPrioridade.isEmpty();
    }

    public String filaAtual() {
        return "Prioridade: " + filaPrioridade.size() + " Normal: " + filaNormal.size();
    }
}
