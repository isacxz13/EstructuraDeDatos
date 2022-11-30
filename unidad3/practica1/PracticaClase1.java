package unidad3.practica1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author xztrece
 */
public class PracticaClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue cola = new LinkedList();
        try {
            for (int i = 0; i < 5; i++) {
                if (i < 3) {
                    if (cola.add(i)) {
                        System.out.println("Se agrego correctamente add()");
                    } else {
                        System.out.println("No se pudo agregar");
                    }
                } else {
                    if (cola.offer(i)) {
                        System.out.println("Se agrego correctamente offer()");
                    } else {
                        System.out.println("No se pudo agregar");
                    }
                }
            }
            System.out.println(cola);
            System.out.println("Elemento que esta en la salida");
            System.out.println(cola.element());
            System.out.println("peek");
            System.out.println(cola.peek());
            System.out.println("\n\nEliminar elementos");
            for (int i = 0; i < 5; i++) {
                if (cola.isEmpty()) {
                    System.out.println("La pila esta vacia no podemos eliminar nada");
                } else {
                    if (i < 3) {
                        System.out.println("El elemento [" + cola.remove() + "] Remove() fue eliminado...");
                    } else {
                        System.out.println("El elemento [" + cola.poll() + "]  POll() fue eliminado...");
                    }
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Ocurrio un error El elemento no se puede Agregar en este momento debido a restricciones de capacidad");
        } catch (ClassCastException e) {
            System.out.println("La clase del elemento especificado impide que se agregue a esta cola");
        } catch (NullPointerException e) {
            System.out.println("El elemento especificado es nulo y esta cola no permite elementos nulos");
        } catch (IllegalArgumentException e) {
            System.out.println("Alguna propiedad de este elemento impide que se agregue a esta cola");
        } finally {

        }
    }
}
