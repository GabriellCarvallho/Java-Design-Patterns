public class ArcoLendarioDecorator extends PersonagemDecorator {

    public ArcoLendarioDecorator(Personagem personagem){
        super(personagem);
    }


    @Override
    public String descricao(){
        return personagem.descricao() + "com arco lendário";
    }

    @Override
    public int ataque(){
        return personagem.ataque() + 25;
    }


    
}
