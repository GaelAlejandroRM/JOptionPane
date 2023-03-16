package joptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author Marcelo
 */
public class InformacionAlumno {
    String nombre;
    String Fecha;
    String Telefono;
    String Direccion;
    String Numero;
    String Semestre;
    String Materias;
    public void InformacionPersonal () {
 nombre = JOptionPane.showInputDialog("Nombre completo del alumno:");
   Fecha = JOptionPane.showInputDialog("fecha de nacimiento del alumno:");
Telefono = JOptionPane.showInputDialog("Numero telefonico del alumno:");
Direccion = JOptionPane.showInputDialog("Direccion del alumno:");
 JOptionPane.showMessageDialog(null, "Datos del alumno:"
                + "Nombre: " + nombre + "\nFecha: " + Fecha
                + "\nTelefono: " + Telefono + "\nDireccion: $" + Direccion);
}
    public void InformacionAcademica(){
        Numero = JOptionPane.showInputDialog("Informacion Academica del alumno:");
        Semestre = JOptionPane.showInputDialog("Semestre del alumno:");
        JOptionPane.showMessageDialog(null, "Datos del alumno:"
                + "Nuymero de cuenta: " + Numero + "\nSemestre: " + Semestre
                );
    }
    public void Horarios(){
    Semestre = JOptionPane.showInputDialog("Matreias del alumno:");   
     JOptionPane.showMessageDialog(null, "Materias del alumno:"
                + "Materias: " + Materias  );
    }
      public static void main(String[] args) {
        InformacionAlumno info=new InformacionAlumno();
        info.InformacionPersonal();
        info.InformacionAcademica();
        info.Horarios();
      }
}
