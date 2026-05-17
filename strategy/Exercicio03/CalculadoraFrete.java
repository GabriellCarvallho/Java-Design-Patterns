public class CalculadoraFrete{
    private FreteStrategy strategy;

    public void setStrategy(FreteStrategy strategy){
        this.strategy = strategy;
    }


    public double calcularFrete(double valorPedido){
        return strategy.calcular(valorPedido);
    }

}
