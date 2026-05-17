public class GatewayAdapter implements PagamentoModerno {

    private GatewayAntigo gatewayantigo;

    public GatewayAdapter(GatewayAntigo gatewayAntigo){
        this.gatewayantigo = gatewayAntigo;
    }

    @Override
    public void pagar(double valor){
        gatewayantigo.realizarTransacao(valor);
    }
    
}
