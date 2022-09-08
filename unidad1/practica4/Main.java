package practica4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaramos variables
        int i = 1;
        int x = 2;
        int c1, c2, c;
        int m;
        String n;
        
        //Objeto para entrada de datos
        Scanner consola = new Scanner(System.in);
        
        //mandamos a llamar arrayDinamicos
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        
        while (i <= x) {
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
            estudiantes.add(estudiante);
            i++;
        }
        //Reporte de datos (Salida)
        System.out.println("\n\n\n");
        System.out.println("            ********************************* LISTADO ************************************");
        
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<Estudiante> iterador = estudiantes.iterator();
        
        while (iterador.hasNext()) {
            Estudiante r = iterador.next();
            System.out.print(r + "\n");
        }
    }
}
