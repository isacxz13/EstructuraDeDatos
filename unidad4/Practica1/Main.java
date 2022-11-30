package unidad4.Practica1;

import java.util.Scanner;

/**
 *
 * @author xztrece
 */

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ABB arbol = new ABB();
        int x;
        int contador = 0;
        int opcionMenu;
        arbol.insertar(86);
        arbol.insertar(4);
        arbol.insertar(84);
        arbol.insertar(12);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(16);
        arbol.insertar(27);
        arbol.insertar(96);
        arbol.insertar(7);
        do {
            System.out.println("\n\n");
            System.out.println(" |                 MENU                         |");
            System.out.println(" |----------------------|-----------------------|");
            System.out.println(" |          1. Insertar dato:                   |");
            System.out.println(" |          2. Buscar dato:                     |");
            System.out.println(" |          3. Eliminar dato:                   |");
            System.out.println(" |          4. Mostrar arbol:                   |");
            System.out.println(" |          5. Recorriendo inorden:             |");
            System.out.println(" |          6. Recorriendo postorden:           |");
            System.out.println(" |          7. Recorriendo preorden:            |");
            System.out.println(" |          8. salir:                           |");
            System.out.println(" |----------------------|-----------------------|");
            System.out.print("\n              Opcion >> ");
            opcionMenu = leer.nextInt();
            
            switch (opcionMenu) {
                case 1 -> {
                    System.out.println("\n\n           INSERTAR DATOS\n");
                    System.out.print("  Dato >> ");
                    x = leer.nextInt();
                    arbol.insertar(x);
                    System.out.println("Dato insertado ["+x+"] correctamente");
                }
                case 2 -> {
                    System.out.println("\n\n           BUSCAR DATOS\n");
                    System.out.print("  Dato >> ");
                    x = leer.nextInt();
                    if(arbol.existe(x)){
                        System.out.println("El dato ["+x+"] encontrado");
                    }else{
                        System.out.println("Dato no encontrado");
                    }
                }
                case 3 -> {
                    System.out.println("\n\n           ELIMINAR DATOS\n");
                    System.out.print("  Dato >> ");
                    x = leer.nextInt();
                    if(arbol.eliminar(x)){
                        System.out.println("Dato ["+x+"] Eliminado con exito del arbol");
                    }else{
                        System.out.println("El dato ["+x+"] no existe en el arbol");
                    }
                }
                case 5 -> {
                    System.out.println("\n\n           RECORRIDO INORDEN\n");
                    arbol.inorden();
                }
                case 6 -> {
                    System.out.println("\n\n           RECORRIDO POSTORDEN\n");
                    arbol.postorden();
                }
                case 7 -> {    
                    System.out.println("\n\n           RECORRIDO PREORDEN\n");
                    arbol.preorden();
                }
                case 4 -> {
                    System.out.println("\n\n           MOSTRAR ARBOL\n");
                    arbol.mostrarArbol(contador);
                }
                case 8 -> System.out.println("\n\nSaliendo...");
                default -> System.out.println("\n\n Opcion no valida! \n");
            }
        } while (opcionMenu != 8);
    }
}
