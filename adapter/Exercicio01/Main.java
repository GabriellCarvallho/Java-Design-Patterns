public class Main {
    public static void main(String[] args){

        // sistema antigo e incompativel
        AparelhoAmericano aparelho = new AparelhoAmericano();

        // adapter traduzidndo interfaces

        TomadaBrasileira adaptador = new AdaptadorAmericano(aparelho);


        // sistema brasileiro usando normalmente

        adaptador.ligar();

    }
    
}
