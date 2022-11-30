/**
 *
 * @author xztrece
 */
package unidad1.practica3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int x = 1;
        Scanner consola = new Scanner(System.in);
        Estudiante[] array = new Estudiante[10];
        int c1,c2,c;
        int m;
        String n;
        while(i < x){
            System.out.println("------------------------------------------------------------");
            System.out.print("Numero de control: ");
            m = consola.nextInt();
            System.out.print("Nombre: ");
            n = consola.next();
            System.out.print("Calificacion 1: ");
            c = consola.nextInt();
            System.out.print("Calificacion 2: ");
            c1 = consola.nextInt();
            System.out.print("Calificacion 3: ");
            c2 = consola.nextInt();
            
            Estudiante estudiante = new Estudiante(m, n, c, c1, c2);
            array[i] = estudiante;
            i ++;   
        }
        i = 0;
        //Reporte de datos (Salida)
        System.out.println("            ********************************* LISTADO ************************************");
        while(i < x){
            System.out.println(array[i]);
            i ++;
        }
    }
}
