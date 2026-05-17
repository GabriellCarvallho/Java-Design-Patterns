package Exercicio02;

public class Diretor extends Aprovador{
    @Override
    public void aprovar(double valor){
        if(valor > 5000){
            System.out.println("Aprovado. Valor:" + valor);
        }else{
            System.out.println("Valor inválido");
        }
    }
    
}
