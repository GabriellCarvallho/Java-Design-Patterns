public class SedexStrategy implements FreteStrategy{
    @Override
    public double calcular(double valorPedido){
        return (valorPedido * 0.10) + 20;
    }

}
