public class CapaInvisivelDecorator extends PersonagemDecorator {

    public CapaInvisivelDecorator(Personagem personagem){
        super(personagem);

    }

    @Override
    public String descricao(){
        return personagem.descricao() + "com capa invisivel";
    }

    @Override
    public int ataque(){
        return personagem.ataque() + 10;
    }
    
}
