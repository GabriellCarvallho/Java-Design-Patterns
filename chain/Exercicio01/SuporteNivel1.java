public class SuporteNivel1 extends SuporteHandler{
    @Override
    public void resolver(String problema){
        if(problema.equals("simples")){
            System.out.println("Nivel 1 resolveu o problema simples");
        } else {
            System.out.println("Nivel 1 passou para o próximo");
            proximo.resolver(problema);
        }
    }
    
}
