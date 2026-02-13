package plataforma;

public class YouTube implements PlataformaPublicacion {
    
    @Override
    public void publicar(String contenidoFormateado) {
        System.out.println("\n📺 PUBLICANDO EN YOUTUBE");
        System.out.println("═══════════════════════════════════════");
        System.out.println(contenidoFormateado);
        System.out.println("✓ Generando miniatura...");
        System.out.println("✓ Procesando video en HD...");
        System.out.println("✓ Añadiendo a playlist...");
        System.out.println("✓ Publicación exitosa en YouTube");
        System.out.println("═══════════════════════════════════════\n");
    }
    
    @Override
    public String obtenerNombre() {
        return "YouTube";
    }
}