package Unidad5.Examen;

/**
 *
 * @author xztrece
 */
public class AlgoritmosDeBusqueda {
    private AlgoritimosDeOrdenamiento metodo = new AlgoritimosDeOrdenamiento();
    
    //Busqueda Binaria
    public int binaria(int[] arreglo, int valorABuscar) {
        int minimo = 0;
        int maximo = arreglo.length - 1;
        int posicionValor = 0;
        while (maximo >= minimo) {
            posicionValor = (int) Math.floor((maximo + minimo) / 2);
            if (arreglo[posicionValor] == valorABuscar) {
                return posicionValor;
            } else if (arreglo[posicionValor] > valorABuscar) {
                maximo = posicionValor - 1;
            } else {
                minimo = posicionValor + 1;
            }
        }
        return -1;
    }
    
    //Busqueda secuencial
    public int secuencial(int[] v, int dato) {
        int posicion = -1;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == dato) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
}
