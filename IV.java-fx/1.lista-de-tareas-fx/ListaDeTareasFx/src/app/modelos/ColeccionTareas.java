package app.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Felipe Concha Almeida
 */
public class ColeccionTareas {
    private ArrayList<Tarea> tareas;
    
    public ColeccionTareas(){
        tareas = new ArrayList<>();
    }

    public ArrayList<Tarea> getTareas(){
        return tareas;
    }
    
    public boolean agregarTarea(Tarea tarea){
        return tareas.add(tarea);
    }
    
    public Tarea eliminarTarea(String id){        
        Tarea tareaEliminada;

        for (Tarea tarea : tareas) {
            if(id.equals(tarea.getId())) {
                tareaEliminada = tarea;
                tareas.remove(tarea);
                return tareaEliminada;
            }
        }
        return null;
    }

    public Tarea modificarTarea(String id, String contenido) {
        for (int i = 0;  i < tareas.size();  i++) {
            Tarea tarea = tareas.get(i);
            
            if(id.equals(tarea.getId())) {
                tarea.setContenido(contenido);
                tarea.setModificadoEn(LocalDateTime.now());
                tareas.set(i, tarea);
                return tarea;
            }
        }
        return null;
    }
}
