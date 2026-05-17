public class BaconDecorator extends PizzaDecorator {
    public BaconDecorator(Pizza pizza){
        super(pizza);
    }
    

    public String descricao(){
        return pizza.descricao() + "com bacon";
    }

    public double preco(){
        return pizza.preco() + 12;
    }
}
