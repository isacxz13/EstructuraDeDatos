package Unidad5.Examen;

import java.util.Arrays;

/**
 *
 * @author xztrece
 */
public class Test {

    public static void main(String[] args) {
        AlgoritimosDeOrdenamiento metodo = new AlgoritimosDeOrdenamiento();
        int range = 10;
        long startTime, endTime, endTime1, endTime2;
        long exchanges, exchanges1, exchanges2;
        int data[] = new int[range];
        for (int i = 0; i < range; i++) {
            data[i] = (int) (Math.random() * 99999 + 10000);
        }
        int data2[] = Arrays.copyOfRange(data, 0, range);
        int data3[] = Arrays.copyOfRange(data, 0, range);
        int dataOrigy[] = Arrays.copyOfRange(data, 0, range);

        startTime = System.nanoTime();
        metodo.mergeSort(data);
        endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        exchanges = metodo.getIntercambios();

        startTime = System.nanoTime();
        metodo.shell(data2);
        endTime1 = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        exchanges1 = metodo.getIntercambios();

        startTime = System.nanoTime();
        data3 = metodo.radix(data3);
        endTime2 = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        exchanges2 = metodo.getIntercambios();

        System.out.println("|        |  " + exchanges + "   | " + exchanges1 + " | " + exchanges2 + " |");
        System.out.println("| Origy  | MergeSort | Shell | Radix |");
        System.out.println("| Origy  |  " + (endTime) / 1e6 + "   | " + (endTime1) / 1e6 + " | " + (endTime2) / 1e6 + " |");

        for (int i = 0; i < range; i++) {
            System.out.println("|  " + dataOrigy[i] + "  |   " + data[i] + "   |   " + data2[i] + "   |   " + data3[i] + "   | ");
        }
    }
}
