package unidad3.practica1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author xztrece
 */
public class ColasAndList {

    public static void main(String[] args) {
        Queue cola = new LinkedList();
        Queue cola2 = new LinkedList();
        Queue cola3 = new LinkedList();
        Queue cola4 = new LinkedList();
        LinkedList list = new LinkedList();
        
        cola.offer("Luis");
        cola.offer("Enrique");
        cola.offer("Ana");
        cola.offer("Gabriel");
        cola.offer("feliz");
        cola.offer("Isac");
        cola.offer("Juan");
        cola.offer("Jose");
        cola.offer("Marcos");
        cola.offer("Rogelio");
        cola.offer("Eduardo");
        System.out.println("Nombres: "+cola);
        
        cola2.offer("Gomez");
        cola2.offer("Perez");
        cola2.offer("Alvarez");
        cola2.offer("Rodriguez");
        cola2.offer("Velazquez");
        cola2.offer("Vazquez");
        cola2.offer("riri");
        cola2.offer("Flores");
        cola2.offer("Montanias");
        cola2.offer("Machuca");
        cola2.offer("Dias");
        System.out.println("Apellidos: "+cola2);
        
        for (int i = 0; i < 10; i++) {
            Object apellido = cola2.remove();
            Object nombre = cola.remove();
            if(cola3.offer(apellido) == true && cola4.offer(nombre) == true){
                list.add(apellido+" "+nombre);
            }
        }
        Collections.sort(list);
        int i =1;
        for(Object nombres: list){
            System.out.println((i++)+" "+nombres);
        }
    }
}
