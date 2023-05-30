
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Empleado {
    // CREAR LOS ATRIBUTOS
     private String nombre,apellidos, telefono, direccion;
     public String edad, email, tipo_profesion;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Creandoel metodo para mostrar los datos
    /*void verDatos(){
    System.out.println("Nombre: "+  nombre);
    System.out.println("Apellidos: "+ apellidos);
    System.out.println("Telefono: "+ telefono);
    System.out.println("Direccion: " +  direccion);
    System.out.println("Edad: " +  edad);
    System.out.println("Tipo de Profesion: "+ tipo_profesion);
    System.out.println("Email: "+ email);*/
    
    public Empleado(String nom, String ed,String tel, String dir, String em, String prof, String apell){        
        this.direccion=dir;
        this.edad=ed;
        this.telefono=tel;
        this.nombre=nom;
        this.email=em;
        this.tipo_profesion=prof;
        this.apellidos=apell;
    }
    
    public void verDatos(){
    JOptionPane.showMessageDialog(null,"\nNombre:"+ nombre +"\nEdad: "+ edad + "\nApellidos: " + apellidos +
            "\nTelefono: " + telefono + "\nDireccion: " + direccion + "\nEmail: "+ email + "\nTpo de Profesion: "+ tipo_profesion, "Datos del Empleado",
            JOptionPane.INFORMATION_MESSAGE);
    }
    }
