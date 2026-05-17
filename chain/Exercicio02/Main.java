package Exercicio02;

public class Main {
    public static void main(String[] args){
        Supervisor nivel1 = new Supervisor();
        Gerente nivel2 = new Gerente();
        Diretor nivel3 = new Diretor();

        nivel1.setAprovador(nivel2);
        nivel2.setAprovador(nivel3);

        System.out.println("Nivel 1 aprovou");
        nivel1.aprovar(100);
        System.out.println();

        System.out.println("Nivel 2 aprovou");
        nivel2.aprovar(100);
        System.out.println();

        System.out.println("Nivel 3 aprovou");
        nivel3.aprovar(1000);
        System.out.println();

        


    }
    
}
