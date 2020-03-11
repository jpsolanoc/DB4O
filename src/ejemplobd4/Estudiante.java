/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobd4;

import java.util.Date;

/**
 *
 * @author jpsolanoc
 */
public class Estudiante {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private Date fechaNacimiento;
    private String correo;
    private String telefono;

    public Estudiante() {
    }

    public Estudiante(String dni) {
        this.dni = dni;
    }
    
    
 
    
    
    public Estudiante(String nombre, String apellidos, int edad, Date fechaNacimiento, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", correo=" + correo + ", telefono=" + telefono + '}'+"\n";
    }

 

    
    
    
}
