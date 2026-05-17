package Exercicio02;

public class Gerente extends Aprovador {
    @Override
    public void aprovar(double valor){
        if(valor <= 5000){
            System.out.println("Nivel 2 aprovou. Valor: " + valor);
        }else {
            proximo.aprovar(valor);
        }
    }
    
}
