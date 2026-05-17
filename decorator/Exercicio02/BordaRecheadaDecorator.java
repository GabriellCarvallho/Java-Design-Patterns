public class BordaRecheadaDecorator extends PizzaDecorator {
    public BordaRecheadaDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String descricao(){
        return pizza.descricao() + "com borda recheada";
    }

    @Override
    public double preco(){
        return pizza.preco() + 15;
    }
     
}
