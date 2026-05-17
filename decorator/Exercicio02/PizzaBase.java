public class PizzaBase implements Pizza {

    @Override
    public String descricao(){
        return "Pizza Simples";
    }

    @Override
    public double preco(){
        return 20.00;
    }
    
}
