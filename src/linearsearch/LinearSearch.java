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
    // definir el arrglo, con un conjunto de números
    int array[] = {7, 12, 3, 9, 14, 6, 8, 1, 11, 5, 13, 2, 10, 4, 15};
    // Establecer el nuemro que se va a encontrar en la lista 
    int target = 15;
   
    int result = linearSearch(array, target);
    
    if(result != -1){
        System.out.println("El numero" + target+ "se encuentra en la posion " + result);
    }else{
        System.out.println("El elemento" + target + "no se encontro en numero  en la lista");
        }
    }

    private static int linearSearch(int[] array, int target) {
        
    }
    
}
