package contenido;

import plataforma.PlataformaPublicacion;

public class VideoCorto extends Contenido {
    
    private String urlVideo;
    private String hashtags;
    private String musica;
    
    public VideoCorto(PlataformaPublicacion plataforma, String urlVideo, 
                     String hashtags, String musica) {
        super(plataforma);
        this.urlVideo = urlVideo;
        this.hashtags = hashtags;
        this.musica = musica;
    }
    
    @Override
    public void publicar() {
        String contenidoFormateado = formatearContenido();
        plataforma.publicar(contenidoFormateado);
    }
    
    @Override
    protected String formatearContenido() {
        StringBuilder sb = new StringBuilder();
        sb.append("🎬 VIDEO CORTO\n");
        sb.append("Video: ").append(urlVideo).append("\n");
        sb.append("Hashtags: ").append(hashtags).append("\n");
        sb.append("Música: ").append(musica);
        return sb.toString();
    }
}