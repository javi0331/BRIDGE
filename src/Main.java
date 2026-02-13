import plataforma.*;
import contenido.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        imprimirTitulo();
        
        // Crear plataformas
        PlataformaPublicacion instagram = new Instagram();
        PlataformaPublicacion tiktok = new TikTok();
        PlataformaPublicacion x = new X();
        PlataformaPublicacion youtube = new YouTube();
        
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("   ESCENARIO 1: PUBLICAR FOTO EN INSTAGRAM");
        System.out.println("═══════════════════════════════════════════════════════════");
        
        Contenido foto = new Foto(instagram, 
                                   "https://ejemplo.com/atardecer.jpg",
                                   "Valencia",
                                   "Atardecer increíble en la playa 🌅 #sunset #beach");
        foto.publicar();
        
        esperarInput();
        
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("   ESCENARIO 2: CAMBIAR FOTO DE INSTAGRAM A TIKTOK");
        System.out.println("═══════════════════════════════════════════════════════════");
        
        foto.cambiarPlataforma(tiktok);
        foto.publicar();
        
        esperarInput();
        
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("   ESCENARIO 3: PUBLICAR HISTORIA EN INSTAGRAM");
        System.out.println("═══════════════════════════════════════════════════════════");
        
        Contenido historia = new Historia(instagram,
                                          "https://ejemplo.com/historia.mp4",
                                          15,
                                          "🔥 Fire emoji");
        historia.publicar();
        
        esperarInput();
        
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("   ESCENARIO 4: PUBLICAR VIDEO CORTO EN YOUTUBE");
        System.out.println("═══════════════════════════════════════════════════════════");
        
        Contenido video = new VideoCorto(youtube,
                                         "https://ejemplo.com/tutorial.mp4",
                                         "#java #programacion #tutorial",
                                         "Lofi Hip Hop");
        video.publicar();
        
        esperarInput();
        
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("   ESCENARIO 5: CAMBIAR VIDEO DE YOUTUBE A TIKTOK");
        System.out.println("═══════════════════════════════════════════════════════════");
        
        video.cambiarPlataforma(tiktok);
        video.publicar();
        
        esperarInput();
        
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("   ESCENARIO 6: PUBLICAR HILO EN X (TWITTER)");
        System.out.println("═══════════════════════════════════════════════════════════");
        
        List<String> tweets = Arrays.asList(
            "El patrón Bridge es increíblemente útil para evitar explosión de clases",
            "Separa la abstracción (QUÉ) de la implementación (CÓMO)",
            "Esto permite que ambas dimensiones evolucionen independientemente",
            "Perfecto para sistemas multi-plataforma como este! 🚀"
        );
        
        Contenido hilo = new Hilo(x, tweets, "Patrón Bridge en Acción");
        hilo.publicar();
        
        esperarInput();
        
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("   ESCENARIO 7: CAMBIAR HILO DE X A INSTAGRAM");
        System.out.println("═══════════════════════════════════════════════════════════");
        
        hilo.cambiarPlataforma(instagram);
        hilo.publicar();
        
        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                                                          ║");
        System.out.println("║     ✅ DEMOSTRACIÓN COMPLETADA                          ║");
        System.out.println("║                                                          ║");
        System.out.println("║  Se probaron todas las combinaciones sin:                ║");
        System.out.println("║  • Crear clases por cada combinación                     ║");
        System.out.println("║  • Usar condicionales para decidir plataforma            ║");
        System.out.println("║  • Modificar código existente al agregar plataformas     ║");
        System.out.println("║                                                          ║");
        System.out.println("║  Patrón Bridge aplicado exitosamente! 🎉                ║");
        System.out.println("║                                                          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
    }
    
    private static void imprimirTitulo() {
        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                                                          ║");
        System.out.println("║     🌉 PATRÓN BRIDGE - PUBLICACIÓN MULTI-RED           ║");
        System.out.println("║                                                          ║");
        System.out.println("║  Sistema de publicación en redes sociales               ║");
        System.out.println("║  Abstracción vs Implementación desacopladas             ║");
        System.out.println("║                                                          ║");
        System.out.println("║  Estudiante: Javier Rodríguez                           ║");
        System.out.println("║  Universidad Distrital Francisco José de Caldas         ║");
        System.out.println("║                                                          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
    }
    
    private static void esperarInput() {
        System.out.println("\n[Presiona ENTER para continuar...]");
        try {
            System.in.read();
            while (System.in.available() > 0) {
                System.in.read();
            }
        } catch (Exception e) {
            // Ignorar
        }
    }
}