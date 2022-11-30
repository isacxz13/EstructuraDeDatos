package unidad3.practica1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author xztrece
 */
public class EstructurasLineales {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Incializar objetos de la clase Stack
        Stack pila = new Stack();
        Stack pila2 = new Stack();

        //Inicializar iterador
        int i = 0;

        //Pedir datos y agregarlos a la pila
        for (i = 0; i < 3; i++) {
            System.out.print((i + 1) + " >> ");
            pila.push(consola.nextInt());
        }
        //Imprimir pila completa
        System.out.println("Elementos Agregados a la pila");
        System.out.println("");
        System.out.println(pila);
        System.out.println(pila.peek());
        System.out.println("");
        System.out.println("Sacar elementos de la pila\n");
        
        //Empezar a sacar elementos de la pila 1 y almacenarlos en la pila de respaldo
        for (i = 0; i < 3; i++) {
            System.out.println("Elemento sacado: [" + pila.peek() + "]");
            pila2.push(pila.peek());
            pila.pop();
        }
        //Imprimir pila de respaldo
        System.out.println("\n\n\nPila de respaldo");
        System.out.println(pila2);
        System.out.println(pila2.peek());
    }
}
