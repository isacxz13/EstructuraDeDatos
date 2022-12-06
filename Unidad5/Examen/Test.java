package Unidad5.Examen;

import java.util.Arrays;
import java.util.Hashtable;

/**
 *
 * @author xztrece
 */
public class Test {

    public static void main(String[] args) {
        //Inicializacion de variables de la clase
        AlgoritimosDeOrdenamiento metodo = new AlgoritimosDeOrdenamiento();
        AlgoritmosDeBusqueda search = new AlgoritmosDeBusqueda();
        Hashtable table1 = new Hashtable();
        
        int range = 8;
        long startTime, endTime, endTime1, endTime2;
        long exchanges, exchanges1, exchanges2;
        int data[] = {5,8,1,6,7,10,205,-3};
        
        table1.put("1542", data[1]);
        table1.put("123", data[2]);
        //System.out.println(table1.get("1542"));
        //System.out.println(table1.get("123"));
        String n = Integer.toBinaryString(151);
        System.out.println(n);
        
        //Llenado de datos al azar por RANDOM
        //int data[] = new int[range];
        /*for (int i = 0; i < range; i++) {
            data[i] = (int) (Math.random() * 99999 + 10000);
        }*/
        /*
        //Copiar datos de los arreglos a arreglos auxiliares utilizados, para diferentes metodos
        int data2[] = Arrays.copyOfRange(data, 0, range);
        int data3[] = Arrays.copyOfRange(data, 0, range);
        int dataOrigy[] = Arrays.copyOfRange(data, 0, range);
        
        //Algoritmo de ordenamiento (MERGE SORT)
        startTime = System.nanoTime();//Incializacion de medidor de tiempo
        metodo.mergeSort(data);
        endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        exchanges = metodo.getIntercambios();

        //Algoritmo de ordenamiento (SHELL)
        startTime = System.nanoTime();//Incializacion de medidor de tiempo
        metodo.shell(data2);
        endTime1 = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        exchanges1 = metodo.getIntercambios();
        
        //Algoritmo de ordenamiento (RADIX)
        startTime = System.nanoTime();//Incializacion de medidor de tiempo
        data3 = metodo.radix(data3);
        endTime2 = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        exchanges2 = metodo.getIntercambios();
        
        //Imprimir datos resultantes
        System.out.println("|        |  " + exchanges + "   | " + exchanges1 + " | " + exchanges2 + " |");
        System.out.println("| method | MergeSort | Shell | Radix |");
        System.out.println("| Time   |  " + (endTime) / 1e6 + "   | " + (endTime1) / 1e6 + " | " + (endTime2) / 1e6 + " |");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < range; i++) {
            System.out.println("|  " + dataOrigy[i] + "  |   " + data[i] + "   |   " + data2[i] + "   |   " + data3[i] + "   | ");
        }
        System.out.println(search.binaria(dataOrigy, 8));*/
        
    }
}
