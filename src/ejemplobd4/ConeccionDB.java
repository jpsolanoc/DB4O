/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobd4;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpsolanoc
 */
public class ConeccionDB {

    private ObjectContainer ob;

    public ConeccionDB(String dataBase) {
        this.ob = Db4o.openFile(dataBase);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        ob.store(estudiante);
        System.out.println("EstudianteAlmcenado:" + estudiante);
    }

    public void eliminarEstudiantes(String cedula) {
        ObjectSet objectSet = ob.queryByExample(new Estudiante(cedula));
        if (objectSet.hasNext()) {
            Estudiante e = (Estudiante) objectSet.next();
            ob.delete(e);
            System.out.println("Estudiante eliminado.");
        } else {
            System.out.println("No hay datos para eliminar");
        }

    }

    public void updateEstudiante(Estudiante eModificado) {
        ObjectSet objectSet = ob.queryByExample(new Estudiante(eModificado.getDni()));
        if (objectSet.hasNext()) {
            Estudiante e = (Estudiante) objectSet.next();
            e = eModificado;
            ob.store(e);
            System.out.println("Estudiante actualizado.");
        } else {
            System.out.println("No se encuentra el estudiantes");
        }

    }

    public Estudiante traerUnEstudiante(String cedula) {
        ObjectSet objectSet = ob.queryByExample(new Estudiante(cedula));
        if (objectSet.hasNext()) {
            System.out.println("tamaño:" + objectSet.size());
            return (Estudiante) objectSet.next();
        }else{
            System.out.println("No se encuentra el estudiante");
            return null;
        }
    }

    public void traerEstudiantes() {
        Estudiante estudiante = new Estudiante(null);
        ObjectSet objectSet = ob.queryByExample(estudiante);        
        while (objectSet.hasNext()) {
            System.out.println(objectSet.next());
            System.out.println("\n_________________\n");
        }
    }

    public List<Estudiante> traerEstudiantesEncontrados(){
        Estudiante estudiante = new Estudiante(null);
        ObjectSet objectSet = ob.queryByExample(estudiante);        
        List<Estudiante> estudiantesEncontrados = new ArrayList<Estudiante>();
        while (objectSet.hasNext()) {
            estudiantesEncontrados.add((Estudiante)objectSet.next());
            
        }
        return estudiantesEncontrados;
    }
    
    public void cerrarConeccion() {
        ob.close();
    }

}
