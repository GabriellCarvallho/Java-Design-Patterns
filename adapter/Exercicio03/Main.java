public class Main {
    public static void main(String[] args){
        SistemaLoginAntigo loginAntigo = new SistemaLoginAntigo();

        AutenticacaoModerna autenticacaoModerna = new LoginAdapter(loginAntigo);

        autenticacaoModerna.autenticar("Gabriel");
    }
    
}
