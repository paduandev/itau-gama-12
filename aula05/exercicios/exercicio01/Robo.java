package exercicios.exercicio01;

public class Robo {
    private int posX, posY;
    private Area area;

    public Robo(Area area) {
        this.area = area;
    }

    private void moverNorte() {
        if(posY < area.getLimiteY()) {
            posY++;
        }
    }

    private void moverSul() {
        if(posY > -area.getLimiteY()) {
            posY--;
        }
    }
    
    private void moverLeste() {
        if(posX < area.getLimiteX()) {
            posX++;
        }
    }
    
    private void moverOeste() {
        if(posX > -area.getLimiteX()) {
            posX--;
        }
    }

    public void navegar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                moverNorte();
                break;
            case SUL:
                moverSul();
                break;
            case LESTE:
                moverLeste();
                break;
            case OESTE:
                moverOeste();
                break;
        }
    }

    public String posicaoAtual() {
        return "x: " + posX + " y: " + posY;
    }


}