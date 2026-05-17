public class LoginAdapter implements AutenticacaoModerna {
    private SistemaLoginAntigo loginAntigo;

    public LoginAdapter(SistemaLoginAntigo loginAntigo){

        this.loginAntigo = loginAntigo;
    }

    @Override
    public void autenticar(String usuario){
        loginAntigo.loginAntigo(usuario);
    }
    
}
