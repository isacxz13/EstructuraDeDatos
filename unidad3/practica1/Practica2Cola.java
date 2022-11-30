package unidad3.practica1;

import java.util.*;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author xztrece
 */
public class Practica2Cola {
        public static Queue cola = new LinkedList();
        public static Scanner consola = new Scanner(System.in);
        public static int opcion;
        public static int elemento;
        public static boolean flag = false;
    
    public static void main(String[] args) {
        System.out.println("Software usando estructura de datos (Colas)");
        try{
            menu();
        }catch(Error error){
            System.out.println("Error grave");
        }catch(NumberFormatException ex){
            System.out.println(ex);
    	}finally{
            consola.close();
            cola.clear();
        }
    }
    
    public static void menu(){
        try{
            do{
                String menu = "            */Menu\\*\n"
                    + "     1.- Encolar Elemento\n"
                    + "     2.- Desencolar Elemento\n"
                    + "     3.- Revisar Frente\n"
                    + "     4.- Revisar Cola\n"
                    + "     5.- Revisar ultimo en la cola\n"
                    + "     6.- Revisar cantidad de elementos\n"
                    + "     7.- Salir";
                System.out.println(menu);
                System.out.print("\nOPCION >> ");
                opcion = consola.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("\nElemento >> ");
                        elemento = consola.nextInt();
                        if(cola.offer(elemento)){
                            System.out.println("\nEl elementos ["+elemento+"] Fue agregado a la cola");
                        }else{
                            System.out.println("\nElemento no fue agregado");
                        }
                        break;
                    case 2:
                        if(cola.isEmpty()){
                            System.out.println("\nNo se desencolar elementos por que la cola esta vacia");
                        }else{
                            System.out.println("\nElemento ["+cola.remove()+"] desencolado correctamente");
                        }
                        break;
                    case 3:
                        if(cola.isEmpty()){
                            System.out.println("\nNo tenemos elementos en la cola");
                        }else{
                            System.out.println("\nFrende de la cola es ["+cola.element()+"]");
                        }
                        break;
                    case 4:
                        System.out.println("\n"+cola);
                        break;
                    case 5:
                        System.out.println("\nUltimo elemento en la cola");
                        break;
                    case 6:
                        System.out.println("\nCantidad de elementos en la cola ["+cola.size()+"] ");
                        break;
                    case 7:
                        System.out.println("\nSaliento del sistema...");
                        break;
                    default:
                        System.out.println("\nOpcion indicada no encotrada");
                }
            }while(opcion != 7);
        }catch(InputMismatchException ex){
            System.out.println("Excepcion [Entrada de datos no relacionados] Error critico");
        }catch(NullPointerException e){
            System.out.println("El elemento especificado es nulo y esta cola no permite elementos nulos");
            menu();
        }catch(IllegalArgumentException e){
            System.out.println("Alguna propiedad de este elemento impide que se agregue a esta cola");
            menu();
        }catch(IllegalStateException e){
            System.out.println("El elemento no se puede agregar en este momento debido a restricciones de capacidad");
            menu();
        }catch(NoSuchElementException e){
            System.out.println("No hay ningun elemento en la cola");
            menu();
        }
    }
}
