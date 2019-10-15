package app.modelos;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author Felipe Concha Almeida
 */
public class Tarea {
    private String id;
    private String contenido;
    private LocalDateTime creadoEn;
    private LocalDateTime modificadoEn;

    public Tarea(String contenido) {
        id = UUID.randomUUID().toString();
        this.contenido = contenido;
        this.creadoEn = LocalDateTime.now();
        this.modificadoEn = LocalDateTime.now();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

    public LocalDateTime getModificadoEn() {
        return modificadoEn;
    }

    public void setModificadoEn(LocalDateTime modificadoEn) {
        this.modificadoEn = modificadoEn;
    }
    
    @Override
    public String toString() {
        return contenido + '\n'+creadoEn; 
    }
}
