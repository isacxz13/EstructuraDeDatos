package Unidad5.Examen;

import java.util.Arrays;

/**
 *
 * @author xztrece
 */
public class Test {

    public static void main(String[] args) {
        //Inicializacion de variables de la clase
        AlgoritimosDeOrdenamiento metodo = new AlgoritimosDeOrdenamiento();
        AlgoritmosDeBusqueda search = new AlgoritmosDeBusqueda();
        int range = 1000;
        long startTime,startTime2,startTime3, endTime, endTime1, endTime2, endTime3, endTime4;
        long exchanges, exchanges1, exchanges2, repetitions, repetitions1,repetitions2;
        int data[] = new int[range];
        
        //Llenado de datos al azar por RANDOM
        for (int i = 0; i < range; i++) {
            data[i] = (int) (Math.random() * 99999 + 10000);
        }
        
        //Copiar datos de los arreglos a arreglos auxiliares utilizados, para diferentes metodos
        int data2[] = Arrays.copyOfRange(data, 0, range);
        int data3[] = Arrays.copyOfRange(data, 0, range);
        int dataOrigy[] = Arrays.copyOfRange(data, 0, range);
        
        //Algoritmo de ordenamiento (MERGE SORT)
        startTime = System.nanoTime();//Incializacion de medidor de tiempo
        metodo.mergeSort(data);
        endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        exchanges = metodo.getIntercambios();
        repetitions = metodo.getCuenta();
        

        //Algoritmo de ordenamiento (SHELL)
        startTime = System.nanoTime();//Incializacion de medidor de tiempo
        metodo.shell(data2);
        endTime1 = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        exchanges1 = metodo.getIntercambios();
        repetitions1 = metodo.getCuenta();
        
        //Algoritmo de ordenamiento (RADIX)
        startTime = System.nanoTime();//Incializacion de medidor de tiempo
        data3 = metodo.radix(data3);
        endTime2 = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        exchanges2 = metodo.getIntercambios();
        repetitions2 = metodo.getCuenta();
        
        //Imprimir datos resultantes
        System.out.println("| method | MergeSort | Shell | Radix |");
        System.out.println("| Repetitions |  " + repetitions + "   | " + repetitions1 + " | " + repetitions2 + " |");
        System.out.println("| exchanges |  " + exchanges + "   | " + exchanges1 + " | " + exchanges2 + " |");
        System.out.println("| method | MergeSort | Shell | Radix |");
        System.out.println("| Time   |  " + (endTime) / 1e6 + "   | " + (endTime1) / 1e6 + " | " + (endTime2) / 1e6 + " |");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < range; i++) {
            System.out.println("|  " + dataOrigy[i] + "  |   " + data[i] + "   |   " + data2[i] + "   |   " + data3[i] + "   | ");
        }
        System.out.println("\n\n\n");
        int dato = data[range/3];
        System.out.println("Dato buscando: [ "+ dato +" ]");
        
        //Busqueda Binaria
        startTime3 = System.nanoTime();
        int indice = search.binaria(data, dato);
        endTime3 = System.nanoTime() - startTime3;
        
        //Busqueda Secuencial
        startTime2 = System.nanoTime();
        int indice2 = search.secuencial(data, dato);
        endTime4 = System.nanoTime() - startTime2;
        
        if(indice < 0 || indice2 < 0){
            System.out.println("Dato no encontrado");
        }else{
            System.out.println("Metodo Binario: Tiempo [ "+(endTime3) / 1e6+" ms ] En encontrar el dato Indice ["+indice+"]");
            System.out.println("Metodo Secuencial: Tiempo [ "+(endTime4) / 1e6+" ms ] En encontrar el dato Indice ["+indice2+"]");
        }
        System.out.println(data2[indice]);
        System.out.println(data2[indice2]);
    }
}
