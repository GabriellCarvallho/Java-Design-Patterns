public class VideoProxy implements Video {
    private String nome;
    private VideoReal videoReal;

    public VideoProxy(String nome){
        this.nome = nome;


    }

    @Override
    public void assistir(){
        if(videoReal == null){
            videoReal = new VideoReal(nome);
        }
        videoReal.assistir();
    }
    
}
