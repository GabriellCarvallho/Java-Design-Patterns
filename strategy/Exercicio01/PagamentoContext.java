public class PagamentoContext {
    private PagamentoStrategy pagamento;

    // aqui vai permitir a troca de estrategia

    public void setPagamento(PagamentoStrategy pagamento){
        this.pagamento = pagamento;
    }

    // aqui vamos executar a estrategia escolhida

    public void realizarPagamento(double valor){
        pagamento.pagar(valor);
    }

}
