package unidad3.practica1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author xztrece
 */
public class PracticaClase2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Queue cola = new LinkedList();
        Stack pila = new Stack();
        Stack pila2 = new Stack();
        Queue cola2 = new LinkedList();
        Queue cola3 = new LinkedList();
        
        cola.offer("Primero");
        cola.offer("tercero");
        cola.offer("Quinto");
        
        pila.push("Segundo");
        pila.push("Cuarto");
        pila.push("Sexto");
        for (int i = 0; i < 3; i++) {
            pila2.push(pila.pop());
        }
        //System.out.println(pila2);
        for (int i = 0; i < 6; i++) {
            if(i %2 == 0){
                cola2.offer(cola.poll());
            }else{
                cola2.offer(pila2.pop());
            }
        }
        System.out.println(cola2);
    }
}
