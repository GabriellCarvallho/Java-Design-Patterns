public class CartaoEstrategy implements PagamentoStrategy {

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de " + valor+ " realizado via cartão");
    }
    
}
