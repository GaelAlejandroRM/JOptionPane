package joptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author Marcelo
 */
public class Calificaciones {
   double promedio;
   int mult; //numero de materias
   String ingles;
           String interaccion;
           String programacion;
           String pmc;
           String requisitos;
           
           public void Materias (){
               interaccion = JOptionPane.showInputDialog("La calificacion de interaccion es:");
               ingles = JOptionPane.showInputDialog("La calificacion de ingles es:");
               programacion = JOptionPane.showInputDialog("La calificacion de programacion es:");
               pmc = JOptionPane.showInputDialog("La calificacion de pmc es:");
               requisitos = JOptionPane.showInputDialog("La calificacion de requisitos es:");
           }
           public void Promedio(){
               JOptionPane.showMessageDialog(null, "Materias que cursa actualmente:"
                + "interaccion: " + interaccion + "\ningles: " + ingles
                + "\nprogramacion: " + programacion + "\npmc: $" + pmc + "\nrequisitos: " + requisitos);
                JOptionPane.showMessageDialog(null, "El promedio del alumno es :"
                + "interaccion: " + interaccion + "\ningles: " + ingles
                + "\nprogramacion: " + programacion + "\npmc: $" + pmc + "\nrequisitos: " + requisitos+ mult + promedio*mult);
           }
           public static void main(String[] args) {
             Calificaciones prom=new Calificaciones();
             prom.Materias();
             prom.Promedio();
           }
}
