package contenido;

import plataforma.PlataformaPublicacion;

public class Historia extends Contenido {
    
    private String urlArchivo;
    private int duracionSegundos;
    private String sticker;
    
    public Historia(PlataformaPublicacion plataforma, String urlArchivo, 
                   int duracionSegundos, String sticker) {
        super(plataforma);
        this.urlArchivo = urlArchivo;
        this.duracionSegundos = duracionSegundos;
        this.sticker = sticker;
    }
    
    @Override
    public void publicar() {
        String contenidoFormateado = formatearContenido();
        plataforma.publicar(contenidoFormateado);
    }
    
    @Override
    protected String formatearContenido() {
        StringBuilder sb = new StringBuilder();
        sb.append("⏱️ HISTORIA\n");
        sb.append("Archivo: ").append(urlArchivo).append("\n");
        sb.append("Duración: ").append(duracionSegundos).append(" segundos\n");
        sb.append("Sticker: ").append(sticker);
        return sb.toString();
    }
}