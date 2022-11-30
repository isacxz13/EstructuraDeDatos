package unidad4.Practica1;

/**
 *
 * @author xztrece
 */

public class ABB {
    private Nodo raiz;

    public ABB() {

    }

    private boolean existe(Nodo n, int busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato() == busqueda) {
            return true;
        } else if (busqueda < n.getDato()) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato,padre));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato,padre));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }
    
    private void mostrarArbol(Nodo arbol,int count){
        if(arbol != null){
            mostrarArbol(arbol.getDerecha(), count+1);
            for(int i=0; i<count; i++){
                System.out.print("    ");
            }
            System.out.print(arbol.getDato()+"\n");
            mostrarArbol(arbol.getIzquierda(), count+1);
        }
    }
    
    private Nodo minimo(Nodo arbol){
        if(arbol == null){
            return null;
        }if(arbol.getIzquierda() != null){
            return this.minimo(arbol.getIzquierda());
        }else{
            return arbol;
        }
    }
    private void reemplazar(Nodo arbol, Nodo nuevoNodo){
        if(arbol.getPadre() != null){
            if(arbol.getDato() == arbol.getPadre().getIzquierda().getDato()){
                arbol.getPadre().setIzquierda(nuevoNodo);
            }else if(arbol.getDato() == arbol.getPadre().getDerecha().getDato()){
                arbol.getPadre().setDerecha(nuevoNodo);
            }
        }if(nuevoNodo != null){
            nuevoNodo.setPadre(arbol.getPadre());
        }
    }
    private void eliminarNodo(Nodo nodoEliminar){
        if(nodoEliminar.getIzquierda() != null && nodoEliminar.getDerecha() != null){
            Nodo menor = minimo(nodoEliminar.getDerecha());
            nodoEliminar.setDato(menor.getDato());
            eliminarNodo(menor);
        }else if(nodoEliminar.getIzquierda() != null){
            reemplazar(nodoEliminar, nodoEliminar.getIzquierda());
            destruirNodo(nodoEliminar);
        }else if(nodoEliminar.getDerecha() != null){
            reemplazar(nodoEliminar, nodoEliminar.getDerecha());
            destruirNodo(nodoEliminar);
        }else{
            reemplazar(nodoEliminar, null);
            destruirNodo(nodoEliminar);
        }
    }
    private void destruirNodo(Nodo nodo){
        nodo.setIzquierda(null);
        nodo.setDerecha(null);
    }
    private void eliminar(Nodo arbol, int n){
        if(arbol != null){
            if(n < arbol.getDato()){
                eliminar(arbol.getIzquierda(),n);
            }else if(n > arbol.getDato()){
                eliminar(arbol.getDerecha(),n);
            }else{
                eliminarNodo(arbol);
            }
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
    
    public void mostrarArbol(int contador){
        this.mostrarArbol(this.raiz, contador);
    }
    public boolean existe(int busqueda) {
        return existe(this.raiz, busqueda);
    }
    
    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato,this.raiz);
        } else {
            this.insertar(this.raiz, dato);
        }
    }
    public boolean eliminar(int dato){
        if(existe(dato)){
            this.eliminar(this.raiz, dato);
            return true;
        }else{
            return false;
        }
    }
}
