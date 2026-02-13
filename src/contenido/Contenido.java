package contenido;

import plataforma.PlataformaPublicacion;

public abstract class Contenido {
    
    protected PlataformaPublicacion plataforma;
    
    public Contenido(PlataformaPublicacion plataforma) {
        this.plataforma = plataforma;
    }
    
    public void cambiarPlataforma(PlataformaPublicacion nuevaPlataforma) {
        System.out.println("\n🔄 Cambiando plataforma de " + 
                         plataforma.obtenerNombre() + " a " + 
                         nuevaPlataforma.obtenerNombre());
        this.plataforma = nuevaPlataforma;
    }
    
    public abstract void publicar();
    
    protected abstract String formatearContenido();
}