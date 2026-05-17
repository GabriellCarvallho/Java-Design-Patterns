public class TransportadoraStrategy implements FreteStrategy{
    @Override
    public double calcular(double valorPedido){
        return (valorPedido * 0.15) + 50;
    }

}
