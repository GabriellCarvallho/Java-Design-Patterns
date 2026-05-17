package Exercicio02;


public class OrdenadorContext  {
    private OrdenacaoStrategy stategy;

    public void setOrdenacaoStrategy(OrdenacaoStrategy strategy){
        this.stategy = strategy;
    }

    public void executarOrdenacao(int[] numeros){
        stategy.ordenar(numeros);
    }


    
}
