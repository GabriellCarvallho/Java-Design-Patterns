package Exercicio02;

public class Supervisor extends Aprovador {
    @Override
    public void aprovar(double valor){
        if(valor <= 1000){
            System.out.println("Nivel 1 resolveu. Valor: " + valor);
        }else {
            proximo.aprovar(valor);
        }
    }
    
}
