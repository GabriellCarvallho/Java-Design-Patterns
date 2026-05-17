public class AdaptadorAmericano implements TomadaBrasileira {
    

    private AparelhoAmericano aparelhoamericano;

    public AdaptadorAmericano(AparelhoAmericano aparelho){
        this.aparelhoamericano = aparelho;
    }

    @Override
    public void ligar(){
        aparelhoamericano.connect();

    }


    
}
