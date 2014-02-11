

package Clase;

import basedatos.ServicioPersona;
import Datos.*;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona persona=new ServicioPersona();
        Persona per = null;
        String cedula,nombres,apellidos;
        
        
        Scanner leer = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("1) Ingresar nueva persona\n"
                    + "2) Buscar Persona\n"
                    + "3) Eliminar\n"
                    + "4) Mostrar\n"
                    + "5) Salir");
             
            System.out.println("Ingrese una opcion:");
            opc= leer.nextInt();
            switch (opc) {
                case 1: System.out.println("Cedula: ");
                    cedula=leer.next();
                    System.out.println("Nombre: ");
                    nombres=leer.next();
                    System.out.println("Apellido: ");
                    apellidos=leer.next();
                    per=new Persona (cedula, nombres, apellidos);
                    persona.nuevo(per);
                    break;
                case 2:
                    System.out.println("Cedula");
                    cedula=leer.next();
                    System.out.println(persona.buscar(cedula));
                    break;
                case 3:
                    persona.eliminar(per);
                    break; 
                case 4:
                   persona.mostrar();
                    break;
                case 5:
                    System.out.println("Gracias!");
                    break;
                default:
                    throw new AssertionError();
            }






        } while (opc < 5 || opc <= 0 || opc> 5);

    }
}