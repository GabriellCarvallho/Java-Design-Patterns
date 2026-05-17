public class Main {
    public static void main(String[] args){

        Personagem personagem = new ArqueiroConcreto();

        personagem = new CapaInvisivelDecorator(personagem);
        personagem = new ArcoLendarioDecorator(personagem);
        personagem = new VelocidadeExtremaDecorator(personagem);

        System.out.println("Descricao: ");
        System.out.println(personagem.descricao());

        System.out.println("Ataque: ");
        System.out.println(personagem.ataque());

    }
}
