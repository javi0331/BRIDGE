package contenido;

import plataforma.PlataformaPublicacion;
import java.util.List;

public class Hilo extends Contenido {
    
    private List<String> tweets;
    private String tema;
    
    public Hilo(PlataformaPublicacion plataforma, List<String> tweets, String tema) {
        super(plataforma);
        this.tweets = tweets;
        this.tema = tema;
    }
    
    @Override
    public void publicar() {
        String contenidoFormateado = formatearContenido();
        plataforma.publicar(contenidoFormateado);
    }
    
    @Override
    protected String formatearContenido() {
        StringBuilder sb = new StringBuilder();
        sb.append("🧵 HILO SOBRE: ").append(tema).append("\n");
        sb.append("Total de tweets: ").append(tweets.size()).append("\n\n");
        
        for (int i = 0; i < tweets.size(); i++) {
            sb.append(i + 1).append("/").append(tweets.size())
              .append(": ").append(tweets.get(i)).append("\n");
        }
        
        return sb.toString();
    }
}