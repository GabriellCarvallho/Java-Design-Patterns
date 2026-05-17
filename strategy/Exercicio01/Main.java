public class Main {
    public static void main(String[] args){
        PagamentoContext context = new PagamentoContext();


        context.setPagamento(new PixStrategy());
        context.realizarPagamento(100);
        System.out.println();


        context.setPagamento(new CartaoEstrategy());
        context.realizarPagamento(100);
        System.out.println();

        context.setPagamento(new BoletoStrategy());
        context.realizarPagamento(100);
        System.out.println();

    }
    
}
