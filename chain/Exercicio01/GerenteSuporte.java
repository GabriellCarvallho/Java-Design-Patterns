public class GerenteSuporte extends SuporteHandler {
    @Override
    public void resolver(String problema){
        if(problema.equals("crítico")){
            System.out.println("Suporte nível 3 conseguiu resolver o problema crítico");
        } else{
            System.out.println("Problema desconhecido");
        }
    }
    
}
