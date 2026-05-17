public class VelocidadeExtremaDecorator extends PersonagemDecorator {
    public VelocidadeExtremaDecorator(Personagem personagem){
        super(personagem);
    }

    @Override
    public String descricao(){
        return personagem.descricao() + " com velocidade extrema";
    }

    @Override
    public int ataque(){
        return personagem.ataque() + 5;
    }
    
}
