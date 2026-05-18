public class PagamentoCartao implements PagamentoEstrategia {
    String numeroCartao;
    String dataExpiracao;
    String codigoSeguranca;


    public PagamentoCartao(String numeroCartao, String dataExpiracao, String codigoSeguranca){
        this.numeroCartao = numeroCartao;
        this.dataExpiracao = dataExpiracao;
        this.codigoSeguranca = codigoSeguranca;
    }


    @Override
    public void ProcessarPagamento(double valorTotal){
        System.out.println("Processando numero do cartao, data de expiração, codigo de segurança...");
        System.out.println("... Validação correta. Valor total do produto: " + valorTotal);
    }
    
    
}