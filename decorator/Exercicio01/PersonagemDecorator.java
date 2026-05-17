public abstract class PersonagemDecorator implements Personagem {
    protected Personagem personagem;

    public PersonagemDecorator(Personagem personagem){
        this.personagem = personagem;
    }

}
