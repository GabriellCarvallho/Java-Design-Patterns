public class QueijoExtraDecorator extends PizzaDecorator {
    public QueijoExtraDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String descricao(){
        return pizza.descricao() + "com queijo extra";
    }

    @Override
    public double preco(){
        return pizza.preco() + 8;
    }
    
}
