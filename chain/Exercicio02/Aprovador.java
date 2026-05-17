package Exercicio02;

public abstract class Aprovador {
    protected Aprovador proximo;

    public void setAprovador(Aprovador proximo){
        this.proximo = proximo;
    }

    public abstract void aprovar(double valor);
}
