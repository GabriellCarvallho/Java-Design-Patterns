public class Main {
    public static void main(String[] args){
        Video video = new VideoProxy("Filme.mp4");

        System.out.println("Proxy criado");

        System.out.println();

        video.assistir();
        
        System.out.println();

        video.assistir();
        
    }
    
}
