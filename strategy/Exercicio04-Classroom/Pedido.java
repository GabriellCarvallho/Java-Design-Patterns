public class Pedido {
    private double valorTotal;



    public Pedido(double valorTotal){
        this.valorTotal = valorTotal;
    }

    public double getPedido(){
        return this.valorTotal;
    }

    public void fecharPagamento(PagamentoEstrategia pagamento){
        pagamento.ProcessarPagamento(this.valorTotal);
    }

    
    
}
