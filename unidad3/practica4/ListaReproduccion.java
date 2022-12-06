package unidad3.practica4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author xztrece
 */

public class ListaReproduccion implements Reproduccion {

    private LinkedList<Cancion> canciones;
    private LinkedList<Cancion> canciones2;

    public ListaReproduccion() {
        this.canciones = new LinkedList();
    }

    @Override
    public boolean agregar(Cancion cancion) {
        String nombre = cancion.getNombre().toUpperCase().charAt(0) + cancion.getNombre().substring(1, cancion.getNombre().length()).toLowerCase();
        cancion.setNombre(nombre);
        return this.canciones.add(cancion);
    }

    @Override
    public Cancion eliminar(int x) {
        return this.canciones.remove(x);
    }

    @Override
    public void eliminarAll() {
        this.canciones.clear();
    }

    @Override
    public int contar() {
        return this.canciones.size();
    }

    @Override
    public void reproducirLineal() {
        for (Cancion cancion : this.canciones) {
            System.out.println("Reproduciendo: " + cancion);
            esperar(3);
        }
    }

    @Override
    public void verLista() {
        int i = 0;
        for (Cancion cancion : this.canciones) {
            System.out.println("ID = " + (i++) + " " + cancion);
        }
    }

    @Override
    public void reproducirAleatoria() {
        int rango = contar();
        int x = rango + 1;
        int y = rango;
        ArrayList numeros = new ArrayList();
        while (rango != 0) {
            boolean flag = true;
            while (flag) {
                x = (int) (Math.random() * y);
                if (numeros.contains((Integer) x)) {
                    x = (int) (Math.random() * y);
                } else {
                    numeros.add((Integer) x);
                    flag = false;
                }
            }
            System.out.println("Reproduciendo: " + this.canciones.get((Integer) x));
            esperar(3);
            rango--;
        }
    }

    @Override
    public boolean estado() {
        return this.canciones.isEmpty();
    }

    private void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    //Busqueda Secuancial
    @Override
    public int where(String name, int option) {
        if(option == 1){
            return busquedaSecuencial(name);
        }else{
            return busquedaBinaria(name);
        }
    }
    @Override
    public void buscar(int indice) {
        System.out.println("Reproduciendo: " + canciones.get(indice));
        esperar(3);
    }

    //Imprime las canciones en orden Alfabetico o inverso ya ordenadas
    @Override
    public void ordenCanciones(int option) {
        this.create();
        int i= 0;
        if (option == 2) {
            for (Cancion name : canciones) {
                System.out.println("ID = " + (i) + " " + name.toString());
                i ++;
            }
        } else {
            for (i = contar()-1; i >= 0; i--) {
                System.out.println("ID = " + (i) + " " + canciones.get(i).toString());
            }
        }
    }

    //Ordenamos las canciones en orden Alfabetico con Algortimo de ordenacion (Burbuja)
    private void create() {
        int i = 0;
        for (i = 1; i <= contar(); i++) {
            for (int j = 0; j < contar() - i; j++) {
                if (canciones.get(j).getNombre().compareTo(canciones.get(j+1).getNombre()) > 0) {
                    Cancion aux = canciones.get(j);
                    canciones.set(j, canciones.get(j+1));
                    canciones.set((j+1), aux);
                }
            }
        }
    }

    private int busquedaBinaria(String busqueda) {
        busqueda = busqueda.toUpperCase();
        this.create();
        int izquierda = 0, derecha = contar() - 1;
        while (izquierda <= derecha) {
            // Calculamos las mitades...
            int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
            String elementoDelMedio = canciones.get(indiceDelElementoDelMedio).getNombre();
            elementoDelMedio = elementoDelMedio.toUpperCase();
            // Primero vamos a comparar y ver si el resultado es negativo, positivo o 0
            int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);

            // Si el resultado de la comparación es 0, significa que ambos elementos son iguales
            // y por lo tanto quiere decir que hemos encontrado la búsqueda
            if (resultadoDeLaComparacion == 0) {
                return indiceDelElementoDelMedio;
            }
            // Si no, entonces vemos si está a la izquierda o derecha
            if (resultadoDeLaComparacion < 0) {
                derecha = indiceDelElementoDelMedio - 1;
            } else {
                izquierda = indiceDelElementoDelMedio + 1;
            }
        }
        // Si no se rompió el ciclo ni se regresó el índice, entonces el elemento no
        // existe
        return -1;
    }
    
    private int busquedaSecuencial(String name){
        int x=0;
        boolean flag=false;
        for(Cancion cancion: this.canciones){
            if(name.equalsIgnoreCase(cancion.getNombre())){
                flag = true;
                break;
            }
            x++;
        }if(flag){
            return x;
        }else{
            return -1;
        }
    }
}
