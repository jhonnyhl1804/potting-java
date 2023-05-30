
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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear un Objeto tipo alumno
        
        /*Empleado emple1 = new  Empleado();
        
        //intenta acceder a los atributos Registro_Alumno ya que estan encapsulados
        
        //Accediendo con los metodos los atributos para asignar
        
        emple1.setNombre("juan");
        emple1.setApellidos("suluaga torrez");
        emple1.setTelefono("23139128");
        emple1.setDireccion("Cr 3 Cl40 1-20");
        emple1.edad="23 años";
        emple1.email="juan.suluaga@gmail.com";
        emple1.tipo_profesion="Ing. Sistemas";
        emple1.verDatos();
        System.out.println("Accediendo al empleado: "+ emple1.getNombre() +" Que es privado ");
        */
        // crear otro empleado
    String nom, ed, dir,tel, edad, em, prof, apell;
            
    nom = JOptionPane.showInputDialog(null, "Ingresa el nombre del empleado: ", "Solicitando Datos: ", 2);
    
    apell = JOptionPane.showInputDialog(null,"Ingresa los apellidos del empleado: ", "Solicitando Datos: ", 2);
     
    tel = JOptionPane.showInputDialog(null, "Ingresa el Telefono del empleado: ", "Solicitando Datos: ", 2);
    
    dir= JOptionPane.showInputDialog(null, "Ingresa la Direccion del empleado: ", "Solicitando Datos: ", 2);
    
    ed = JOptionPane.showInputDialog(null, "Ingresa la edad del empleado: ", "Solicitando Datos: ", 2);
        
    em = JOptionPane.showInputDialog(null, "Ingresa el email del empleado: ", "Solicitando Datos: ", 2);
    
    prof = JOptionPane.showInputDialog(null, "Ingresa el Tipo de profesion del empleado: ", "Solicitando Datos: ", 2);
        
    Empleado emple2 = new Empleado(nom, ed,tel, dir, em, prof,apell);
    emple2.verDatos();
        
    }
    
}
