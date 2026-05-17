public class PixStrategy implements PagamentoStrategy {

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de " + valor + " realizado vida PIX");
    }
    
}
