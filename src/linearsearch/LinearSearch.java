/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearch;

/**
 *
 * @author juan 
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir el arreglo con un conjunto de números
        int array[] = {7, 12, 3, 9, 14, 6, 8, 1, 11, 5, 13, 2, 10, 4, 15};
        
        // Establecer el número que se va a encontrar en el arreglo
        int target = 15;
   
        int result = linearSearch(array, target);
        
        if(result != -1){
            System.out.println("El número " + target + " se encuentra en la posición " + result);
        } else {
            System.out.println("El elemento " + target + " no se encontró en el arreglo.");
        }
    }

    private static int linearSearch(int[] array, int target) {
        // Recorrer el arreglo para buscar el número
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                // Devolver la posición del número si se encuentra
                return i;
            }
        }
        // Devolver -1 si el número no se encuentra en el arreglo
        return -1;
    }
}