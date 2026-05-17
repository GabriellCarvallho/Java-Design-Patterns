package Exercicio02;

public class Main {
    public static void main(String[] args){
        int[] numeros = {5, 2,9, 11};

        OrdenadorContext context = new OrdenadorContext();

        context.setOrdenacaoStrategy(new BubbleSorteStrategy());
        context.executarOrdenacao(numeros);

        System.out.println();


        context.setOrdenacaoStrategy(new QuickSorteStrategy());
        context.executarOrdenacao(numeros);
        System.out.println();

        context.setOrdenacaoStrategy(new MergeSorteStrategy());
        context.executarOrdenacao(numeros);

        System.out.println();



    }
    
}
