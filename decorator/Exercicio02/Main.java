public class Main {
    public static void main(String[] args){
        Pizza pizza = new PizzaBase();
        pizza = new QueijoExtraDecorator(pizza);
        pizza = new BordaRecheadaDecorator(pizza);
        pizza = new BaconDecorator(pizza);

        System.out.println("Descricao: ");
        System.out.println(pizza.descricao());

        System.out.println("Preço: ");
        System.out.println(pizza.preco());
    }
    
}
