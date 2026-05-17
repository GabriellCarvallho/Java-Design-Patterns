public class Main {
    public static void main(String[] args){
        GatewayAntigo gatewayAntigo = new GatewayAntigo();

        PagamentoModerno pagamento = new GatewayAdapter(gatewayAntigo);

        pagamento.pagar(100);


    }
    
}
