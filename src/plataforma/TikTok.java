package plataforma;

public class TikTok implements PlataformaPublicacion {
    
    @Override
    public void publicar(String contenidoFormateado) {
        System.out.println("\n🎵 PUBLICANDO EN TIKTOK");
        System.out.println("═══════════════════════════════════════");
        System.out.println(contenidoFormateado);
        System.out.println("✓ Añadiendo música de tendencia...");
        System.out.println("✓ Optimizando para algoritmo FYP...");
        System.out.println("✓ Publicación exitosa en TikTok");
        System.out.println("═══════════════════════════════════════\n");
    }
    
    @Override
    public String obtenerNombre() {
        return "TikTok";
    }
}