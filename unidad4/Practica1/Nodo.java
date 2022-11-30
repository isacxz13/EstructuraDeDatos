package unidad4.Practica1;

/**
 *
 * @author xztrece
 */

public class Nodo {
    private int dato;
    private Nodo izquierda, derecha, padre;

    public Nodo(int dato, Nodo padre) {
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
        this.padre = padre;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    public void imprimirDato() {
        System.out.print(this.getDato()+" -> ");
    }
}
