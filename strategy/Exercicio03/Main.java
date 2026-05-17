public class Main {
    public static void main(String[] args){
        double valorPedido = 1000;

        CalculadoraFrete context = new CalculadoraFrete();


        context.setStrategy(new CorreiosStrategy());
        context.calcularFrete(valorPedido);

        context.setStrategy(new SedexStrategy());
        context.calcularFrete(valorPedido);

        context.setStrategy(new TransportadoraStrategy());
        context.calcularFrete(valorPedido);
        
    }
    
}
