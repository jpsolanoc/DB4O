/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobd4;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;

/**
 *
 * @author jpsolanoc
 */
public class EjemploBD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConeccionDB cn = new ConeccionDB("C:\\Users\\D E L L\\Documents\\BDOO\\estudiante.yap");
       // System.out.println(cn.traerUnEstudiante("1102456677"));
             
//        Estudiante e = new Estudiante();
//        e.setDni("1102456677");
//        e.setNombre("Juan Pablo");
//        e.setApellidos("Guaman");
//        e.setEdad(30);
//        e.setFechaNacimiento(new Date());
//        e.setTelefono("0979256766");        
//        e.setCorreo("jpsss@gmail.com");
//        
//        cn.agregarEstudiante(e);
//        
      
//        
//        cn.updateEstudiante(e);
//        //cn.updateEstudiantePorNombre(e);                      
//        System.out.println(cn.traerUnEstudiante("1102456677"));

//        cn.eliminarEstudiantes("1102456677");
//        cn.traerEstudiantes();


    
        
        System.out.println(cn.traerUnEstudiante("1102456677").toString());
        
        
    }
   
 
    
   
}
