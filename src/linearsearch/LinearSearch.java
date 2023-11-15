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
 private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                // La posición del número a encontrar
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        Files archivo  = new Files();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName ;
        int[] array;
        
        System.out.println("Escribe el nombre del archivo de datos ");
        fileName = bufer.readLine();
        array = archivo.fileToInArray(fileName);
        
        // Establecer el número que se va a encontrar en el arreglo
        int target = 15;
        // Llamar a la función de búsqueda lineal
        int result = linearSearch(array, target);

        // Verificar si el número se encontró en el arreglo
        if (result != -1) {
            System.out.println("El número " + target + " se encuentra en la posición " + result);
        } else {
            System.out.println("El elemento " + target + " no se encontró en el arreglo.");
        }
    }
}