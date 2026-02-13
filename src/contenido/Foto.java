package contenido;

import plataforma.PlataformaPublicacion;

public class Foto extends Contenido {
    
    private String urlImagen;
    private String filtro;
    private String descripcion;
    
    public Foto(PlataformaPublicacion plataforma, String urlImagen, String filtro, String descripcion) {
        super(plataforma);
        this.urlImagen = urlImagen;
        this.filtro = filtro;
        this.descripcion = descripcion;
    }
    
    @Override
    public void publicar() {
        String contenidoFormateado = formatearContenido();
        plataforma.publicar(contenidoFormateado);
    }
    
    @Override
    protected String formatearContenido() {
        StringBuilder sb = new StringBuilder();
        sb.append("📷 FOTO\n");
        sb.append("URL: ").append(urlImagen).append("\n");
        sb.append("Filtro: ").append(filtro).append("\n");
        sb.append("Descripción: ").append(descripcion);
        return sb.toString();
    }
}