package Unidad5.Examen;

/**
 *
 * @author xztrece
 */
public class AlgoritmosDeBusqueda {

    private AlgoritimosDeOrdenamiento metodo = new AlgoritimosDeOrdenamiento();

    //Busqueda Binaria
    public static int binaria(int vector[], int clave) {
        int centro, linferior, lsuperior;
        int valorcentral;

        linferior = 0;
        lsuperior = vector.length - 1;
        while (linferior <= lsuperior) {
            centro = (linferior + lsuperior) / 2;
            valorcentral = vector[centro];
            if (clave == valorcentral) {
                return centro;
            } else {
                if (clave < valorcentral) {
                    lsuperior = centro - 1;
                } else {
                    linferior = centro + 1;
                }
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
