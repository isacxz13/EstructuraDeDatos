package unidad3.practica1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author xztrece
 */
public class Practica1 {
    public static Scanner consola = new Scanner(System.in);
    
    public static void main(String[] args) {
        Stack pila = new Stack();
        int n,x;
        do{
        System.out.println("\n\n\n\n\n * * MENU DE OPERACIONES * * ");
        System.out.println("  1.- Agregar nuevo elemento");
        System.out.println("  2.- Desapilar elemento");
        System.out.println("  3.- Buscar elemento");
        System.out.println("  4.- Ver estado de la pila");
        System.out.println("  5.- Ver cima");
        System.out.println("  6.- Mostrar pila");
        System.out.println("  7.- Salir\n\n");
        System.out.print("Opcion >> ");
        n = consola.nextInt();

            switch(n){
                case 1:
                    System.out.println("\n\n1.- Agregar nuevo elemento");
                    System.out.print("Elemento >> ");
                    x = consola.nextInt();
                    pila.push(x);
                    System.out.println("Elemento correctamente guardado");
                    break;
                case 2:
                    System.out.println("\n\n2.- Desapilar elemento");
                    if(pila.empty()){
                        System.out.println("La pila no tiene elementos");
                    }else{
                        System.out.println("El elemento ["+pila.pop()+"] Desapilado...");
                    }
                    break;
                case 3:
                    System.out.println("\n\n3.- Buscar elemento");
                    System.out.print("Elemento >> ");
                    x = consola.nextInt();
                    int y = pila.search(x);
                    if(y < 1){
                        System.out.println("Elemento no encontrado en la pila");
                    }else{
                        System.out.println(x);
                    }
                    break;
                case 4:
                    System.out.println("\n\n4.- Ver estado de la pila");
                    System.out.println("["+pila.size()+"] Elementos encontrados en la pila");
                    break;
                case 5:
                    if(pila.empty()){
                        System.out.println("La pila no tiene elementos");
                    }else{
                        System.out.println("\n\n5.- Ver cima");
                        System.out.println("Cima >> ["+pila.peek()+"]");
                    }
                    break;
                case 6:
                    System.out.println("\n\n6.- Mostrar pila");
                    System.out.println(pila);
                    break;
                case 7:
                    System.out.println("\n\nSaliendo del sistema");
                    break;
                default: System.out.println("\n\nOpcion no encontrada");
                    break;
            }
        }while(n != 7);
    }
}