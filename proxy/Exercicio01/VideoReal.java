public class VideoReal implements Video {
    private String nome;  
    
    public VideoReal(String nome){
        this.nome = nome;

        System.out.println("Carregando video pesado...");
    }

    public void assistir(){
        System.out.println("Assistindo video: " + nome);

    }
}
