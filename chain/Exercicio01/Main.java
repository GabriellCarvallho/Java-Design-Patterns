public class Main {
    public static void main(String[] args){
        SuporteNivel1 nivel1 = new SuporteNivel1();
        SuporteNivel2 nivel2 = new SuporteNivel2();
        GerenteSuporte gerente = new GerenteSuporte();

        nivel1.setProximo(nivel2);
        nivel2.setProximo(gerente);


        System.out.println("PROBLEMA SIMPLES");
        nivel1.resolver("simples");
        System.out.println();
        System.out.println("PROBLEMA MÉDIO");
        nivel2.resolver("médio");
        System.out.println();        
        System.out.println("PROBLEMA CRÍTICO");
        nivel2.resolver("crítico");

    }
    
}
