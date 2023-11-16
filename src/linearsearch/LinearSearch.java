 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearch;

import files.Files;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juan 
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Files archivo  = new Files();//instancia 
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName ;
        int[] array;//arreglo de enteros
        int target; //se busca el numero 
        
        System.out.println("Escribe el nombre del archivo de datos ");
        fileName = bufer.readLine();
        array = archivo.fileToInArray(fileName);
        
   
        System.out.println("¿Que numero quieres buscar?");
        target = Integer.parseInt(bufer.readLine());
        
        // Llamar a la función de búsqueda lineal
        int result = linearSearch(array, target);

        // Verificar si el número se encontró en el arreglo
        if (result != -1) {
            System.out.println("El número " + target + " se encuentra en la posición " + result + " en la lista " );
        } else {
            System.out.println("El numero " + target + " no se encontró en la lista");
        }
        
    }
    //la funcion de busqueda 
      private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                //Se encontro el numero y posicon del array 
                return i;
            }
        }
        //El numero no esta en el array 
        return -1;
    }
    
}