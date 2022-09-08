package unidad1.practica2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        int x = 2;
        String cadena = "";
        Scanner consola = new Scanner(System.in);
        Estudiante[] array = new Estudiante[10];
        int c1,c2,c;
        int m;
        String n;
        while(i <= x){
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
            cadena += estudiante.toString();
            cadena += "\n";
            i ++;   
        }
        i = 1;
        //Reporte de datos (Salida)
        System.out.println("            ********************************* LISTADO ************************************");
        System.out.println(cadena);
    }
}
