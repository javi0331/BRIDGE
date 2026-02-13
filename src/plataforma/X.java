package plataforma;

public class X implements PlataformaPublicacion {
    
    @Override
    public void publicar(String contenidoFormateado) {
        System.out.println("\n🐦 PUBLICANDO EN X (TWITTER)");
        System.out.println("═══════════════════════════════════════");
        System.out.println(contenidoFormateado);
        System.out.println("✓ Verificando límite de caracteres...");
        System.out.println("✓ Procesando hashtags...");
        System.out.println("✓ Publicación exitosa en X");
        System.out.println("═══════════════════════════════════════\n");
    }
    
    @Override
    public String obtenerNombre() {
        return "X (Twitter)";
    }
}