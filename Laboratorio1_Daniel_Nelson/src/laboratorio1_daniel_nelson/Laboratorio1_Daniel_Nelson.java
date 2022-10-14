
package laboratorio1_daniel_nelson;

import java.util.Scanner;

public class Laboratorio1_Daniel_Nelson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ( "== Bienvenido al sistema del calculo del promedio ==");
        System.out.print ("Ingrese su nombre: "); // Se ingresa el nombre del usuario
        String nombre = entrada.nextLine();
        
        // Se ingresan las notas de cuatro clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print("Ingresa la nota de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota de la tercera clase: ");
        double teceraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        // Se calcula el promedio
        double sumaClase = primeraClase + segundaClase + teceraClase + cuartaClase;
        double promedio = sumaClase / 4;
        
        // Se impreme el calculo del promedio
        System.out.println("====" + nombre + "el promedio de las clases es: " + promedio );
                
        
        
 
        
    }
    
}
