public class PagamentoPayPal implements PagamentoEstrategia{
    String email;
    String senha;


    public PagamentoPayPal(String email, String senha){
        this.email = email;
        this.senha = senha;
    }


    @Override
    public void ProcessarPagamento(double valorTotal){
        System.out.println("Valor total: " + valorTotal);
    }

}