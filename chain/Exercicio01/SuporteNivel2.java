public class SuporteNivel2 extends SuporteHandler {

    @Override
    public void resolver(String problema){
        if(problema.equals("medio")){
            System.out.println("Nível 2 conseguiu resolver o problema médio");
        } else{
            System.out.println("Nivel 2 não conseguiu resolver o problema médio");
            proximo.resolver(problema);
        }
    }
    
}
