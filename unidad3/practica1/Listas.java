package unidad3.practica1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author xztrece
 */
public class Listas {

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(1,3);
        list.add(1,4);
        list.addFirst(5);
        System.out.println(list.getFirst());
        list.addFirst(6);
        System.out.println("Primer elemento en la lista: "+list.getFirst());
        list.addLast(15);
        System.out.println("Ultimo en la lista: "+list.getLast());
        list.addLast(16);
        System.out.println("Ultimo en la lista: "+list.getLast());
        System.out.println(list);
        System.out.println("Eliminando el primero: "+list.remove());
        System.out.println("Ultimo en la lista: "+list.getLast());
        System.out.println("Primero en la lista: "+list.getFirst());
        System.out.println("Eliminando el index: "+list.remove(1));
        System.out.println("Ultimo en la lista: "+list.getLast());
        System.out.println("Primero en la lista: "+list.getFirst());
        System.out.println("Eliminando el valor: "+list.remove((Integer)15));
        System.out.println("Ultimo en la lista: "+list.getLast());
        System.out.println("Primero en la lista: "+list.getFirst());
        System.out.println("Eliminando el primero: "+list.removeFirst());
        System.out.println("Ultimo en la lista: "+list.getLast());
        System.out.println("Primero en la lista: "+list.getFirst());
        System.out.println("Eliminando el ultimo: "+list.removeLast());
        System.out.println("Ultimo en la lista: "+list.getLast());
        System.out.println("Primero en la lista: "+list.getFirst());
    }
    
}
