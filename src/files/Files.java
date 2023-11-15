package files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JUAN 
 */
public class Files {
    
    public  int countFileLines(String name){
        
        File archivo; //apunta a un archivo fisico del dd
        FileReader reader; //llave con permiso de solo lectura
        BufferedReader bufer; //recuperar info. del archivo
        int numLineas = 0;
        
        try{
            //crear un apuntador al archivo fisico
            archivo = new File("C:\\Users\\ROBERTO\\Desktop\\" + name + ".txt");          
            reader = new FileReader(archivo);            
            bufer = new BufferedReader(reader);
            //contar las lineas que tiene el archivo
            while((bufer.readLine())!= null ){
                numLineas++;
            }
            reader.close();
        } catch( Exception e ){
            System.out.println("Error al leer el archivo: "+ e.toString());
        }
        
        return numLineas;
    }
    
    public  String[] fileToStringArray(String name) throws IOException{
        File archivo; //apunta a un archivo fisico del dd
        FileReader reader; //llave con permiso de solo lectura
        BufferedReader bufer; //recuperar info. del archivo
        String linea;
        String[] array = null;
        int t;
        int i = 0;
        
        try{
            //obtener tamaño archivo
            t = countFileLines(name);
            //con el tamaño del archivo, contruimos arreglos
            array = new String[t];
            //crear un apuntador al archivo fisico
            archivo = new File("C:\\Users\\ROBERTO\\Desktop\\" + name + ".txt");
            //abrir el archivo para lectura
            reader = new FileReader(archivo);
            //configurar el bufer para leer datos del archivo
            bufer = new BufferedReader(reader);
            //lectura de contenido del archivo
            while((linea = bufer.readLine())!= null ){
                //System.out.println("Linea leida: "+ linea);
                array[i] = linea;
                i++;
        }
            reader.close();
        } catch( Exception e ){
            System.out.println("Error al leer el archivo: "+ e.toString());
        }
        return array;
    }
    
    public  int[] fileToInArray(String name) throws IOException{
        File archivo; //apunta a un archivo fisico del dd
        FileReader reader; //llave con permiso de solo lectura
        BufferedReader bufer; //recuperar info. del archivo
        String linea;
        int[] array = null;
        int t;
        int i = 0;
        
        try{
            
            t = countFileLines(name);
            array = new int[t];
            archivo = new File("C:\\Users\\ROBERTO\\Desktop\\" + name + ".txt");
            reader = new FileReader(archivo);
            //configurar el  para leer datos del archivo
            bufer = new BufferedReader(reader);
            while((linea = bufer.readLine())!= null ){
                array[i] = Integer.parseInt(linea);
                i++;
        }
            reader.close();
        } catch( Exception e ){
            System.out.println("Error al leer el archivo: "+ e.toString());
        }
        return array;
    }
    
    public  void writerKeyboardFile(String name){
        FileWriter archivo; //apuntador a espacio fisico de DD
        //llave de acceso para escribir archivo
        PrintWriter writer;
        //para escibir de teclado a dd
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada = null;
        char respuesta;
        
        try{
            //apuntador al archivo por crear
            archivo = new FileWriter("C:\\Users\\ROBERTO\\Desktop\\" + name + ".txt");
            //abrir el archivo en modo escritura
            writer = new PrintWriter(archivo);
            do {
                System.out.println("Escribe datos para guardar al archivo: ");
                //guardar lo recuperado desde teclado al archivo
                writer.println(entrada);
                System.out.println("Escribe x para salir, cualquier otra tecla para continuar");
                entrada = bufer.readLine();
                respuesta = entrada.charAt(0);
            }while( respuesta != 'x' );
            archivo.close();
        } catch( Exception e ){
            System.out.println("Error al escribir el archivo " + e.toString());
        }
    }
    
    //crear un archivo con info de un arreglo
    public  void writerArrayToFile(String name, int[] array){
        
        FileWriter archivo; 
        PrintWriter writer;
        try{
            archivo = new FileWriter("C:\\Users\\ROBERTO\\Desktop\\" + name + ".txt");
            writer = new PrintWriter(archivo);
            
            //guardar el arreglo a un archivo
            for ( int unDato : array ){
            writer.println(unDato);
            }
            archivo.close();
        } catch( Exception e ){
            System.out.println("Error al escribir el archivo " + e.toString());
            
        }
    }
}