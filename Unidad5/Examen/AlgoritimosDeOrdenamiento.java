package Unidad5.Examen;

import java.util.Arrays;

/**
 *
 * @author xztrece
 */
public class AlgoritimosDeOrdenamiento {

    private int i, j, temporal, k;
    private long intercambios, cuenta;

    public AlgoritimosDeOrdenamiento() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
        this.intercambios = 0;
        this.cuenta = 0;
    }

    public long getIntercambios() {
        return intercambios;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void shell(int[] arreglo) {
        intercambios = 0;
        cuenta = 0;
        int salto, auxiliar;
        salto = arreglo.length / 2;
        while (salto > 0) {
            for (i = salto; i < arreglo.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arreglo[j] <= arreglo[k]) {
                        j = -1;
                    } else {
                        intercambios ++;
                        auxiliar = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = auxiliar;
                        j = j - salto;
                    }
                    cuenta ++;
                }
            }
            salto = salto / 2;
        }
    }

    public int[] radix(int[] arreglo) {
        intercambios = 0;
        cuenta = 0;
        int x;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            int auxiliar[] = new int[arreglo.length];
            j = 0;
            for (i = 0; i < arreglo.length; i++) {
                boolean mover = arreglo[i] << x >= 0;
                if (x == 0 ? !mover : mover) {
                    auxiliar[j] = arreglo[i];
                    j++;
                    intercambios ++;
                } else {
                    arreglo[i - j] = arreglo[i];
                    intercambios ++;
                }
            }
            for (i = j; i < auxiliar.length; i++) {
                auxiliar[i] = arreglo[i - j];
                intercambios ++;
            }
            arreglo = auxiliar;
        }
        return arreglo;
    }

    public void mergeSort(int vec[]) {
        intercambios = 0;
        cuenta = 0;
        if (vec.length <= 1) {
            return;
        }
        int mitad = vec.length / 2;
        int izq[] = Arrays.copyOfRange(vec, 0, mitad);
        int der[] = Arrays.copyOfRange(vec, mitad, vec.length);
        mergeSort(izq);
        mergeSort(der);
        combinarVector(vec, izq, der);
    }

    public void combinarVector(int v[], int izq[], int der[]) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < v.length; k++) {
            if (i >= izq.length) {
                v[k] = der[j];
                j++;
                intercambios ++;
                continue;
            }
            if (j >= der.length) {
                v[k] = izq[i];
                i++;
                intercambios ++;
                continue;
            }
            if (izq[i] < der[j]) {
                v[k] = izq[i];
                i++;
            } else {
                v[k] = der[j];
                j++;
            }
        }
    }

    public void printArray(int data[]) {
        for(int dato: data){
            System.out.print(dato + " | " );
        }
        System.out.println("");
    }
}
