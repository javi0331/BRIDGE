package plataforma;

public class Instagram implements PlataformaPublicacion {
    
    @Override
    public void publicar(String contenidoFormateado) {
        System.out.println("\n📸 PUBLICANDO EN INSTAGRAM");
        System.out.println("═══════════════════════════════════════");
        System.out.println(contenidoFormateado);
        System.out.println("✓ Aplicando filtros de Instagram...");
        System.out.println("✓ Optimizando para feed y stories...");
        System.out.println("✓ Publicación exitosa en Instagram");
        System.out.println("═══════════════════════════════════════\n");
    }
    
    @Override
    public String obtenerNombre() {
        return "Instagram";
    }
}