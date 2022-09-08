package practica1;

import java.util.Scanner;

public class Xztrece {

    public static void main(String[] args) {
        
        //Declaracion de variables de la clase
        Scanner consola = new Scanner(System.in);
        String n1,n2,n3,n4,n5,n6,n7,n8,n9,n0;
        int c1,c2,c3,c4,c5,c6,c7,c8,c9,c0;
        int c12,c22,c32,c42,c52,c62,c72,c82,c92,c02;
        int c13,c23,c33,c43,c53,c63,c73,c83,c93,c03;
        double p1,p2,p3,p4,p5,p6,p7,p8,p9,p0;
        int m1,m2,m3,m4,m5,m6,m7,m8,m9,m0;
        
        //Entrada de tados desde consola a usuario
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m1 = consola.nextInt();
        System.out.print("Nombre: ");
        n1 = consola.next();
        System.out.print("Calificacion 1: ");
        c1 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c12 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c13 = consola.nextInt();
        p1 = (c1+c12+c13)/3;
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m2 = consola.nextInt();
        System.out.print("Nombre: ");
        n2 = consola.next();
        System.out.print("Calificacion 1: ");
        c2 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c22 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c23 = consola.nextInt();
        p2 = (c2+c22+c23)/3;
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m3 = consola.nextInt();
        System.out.print("Nombre: ");
        n3 = consola.next();
        System.out.print("Calificacion 1: ");
        c3 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c32 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c33 = consola.nextInt();
        p3 = (c3+c32+c33)/3;
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m4 = consola.nextInt();
        System.out.print("Nombre: ");
        n4 = consola.next();
        System.out.print("Calificacion 1: ");
        c4 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c42 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c43 = consola.nextInt();
        p4 = (c4+c42+c43)/3;
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m5 = consola.nextInt();
        System.out.print("Nombre: ");
        n5 = consola.next();
        System.out.print("Calificacion 1: ");
        c5 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c52 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c53 = consola.nextInt();
        p5 = (c5+c52+c53)/3;
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m6 = consola.nextInt();
        System.out.print("Nombre: ");
        n6 = consola.next();
        System.out.print("Calificacion 1: ");
        c6 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c62 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c63 = consola.nextInt();
        p6 = (c6+c62+c63)/3;
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m7 = consola.nextInt();
        System.out.print("Nombre: ");
        n7 = consola.next();
        System.out.print("Calificacion 1: ");
        c7 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c72 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c73 = consola.nextInt();
        p7 = (c7+c72+c73)/3;
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m8 = consola.nextInt();
        System.out.print("Nombre: ");
        n8 = consola.next();
        System.out.print("Calificacion 1: ");
        c8 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c82 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c83 = consola.nextInt();
        p8 = (c8+c82+c83)/3;
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m9 = consola.nextInt();
        System.out.print("Nombre: ");
        n9 = consola.next();
        System.out.print("Calificacion 1: ");
        c9 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c92 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c93 = consola.nextInt();
        p9 = (c9+c92+c93)/3;
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Numero de control: ");
        m0 = consola.nextInt();
        System.out.print("Nombre: ");
        n0 = consola.next();
        System.out.print("Calificacion 1: ");
        c0 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        c02 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        c03 = consola.nextInt();
        p0 = (c0+c02+c03)/3;
        System.out.println("\n\n");
        
        //Reporte de datos (Salida)
        System.out.println("            ********************************* LISTADO ************************************");
        System.out.println("1 [N control = "+m1 + " Nombre: "+n1+" Calificacion 1 = "+c1
        +" Calificacion 2 = "+c12+" Calificacion 3 = "+c13+" Promedio = "+p1+" ]");
        System.out.println("2 [N control = "+m2 + " Nombre: "+n2+" Calificacion 1 = "+c2
        +" Calificacion 2 = "+c22+" Calificacion 3 = "+c23+" Promedio = "+p2+" ]");
        System.out.println("3 [N control = "+m3 + " Nombre: "+n3+" Calificacion 1 = "+c3
        +" Calificacion 2 = "+c32+" Calificacion 3 = "+c33+" Promedio = "+p3+" ]");
        System.out.println("4 [N control = "+m4 + " Nombre: "+n4+" Calificacion 1 = "+c4
        +" Calificacion 2 = "+c42+" Calificacion 3 = "+c43+" Promedio = "+p4+" ]");
        System.out.println("5 [N control = "+m5 + " Nombre: "+n5+" Calificacion 1 = "+c5
        +" Calificacion 2 = "+c52+" Calificacion 3 = "+c53+" Promedio = "+p5+" ]");
        System.out.println("6 [N control = "+m6 + " Nombre: "+n6+" Calificacion 1 = "+c6
        +" Calificacion 2 = "+c62+" Calificacion 3 = "+c63+" Promedio = "+p6+" ]");
        System.out.println("7 [N control = "+m7 + " Nombre: "+n7+" Calificacion 1 = "+c7
        +" Calificacion 2 = "+c72+" Calificacion 3 = "+c73+" Promedio = "+p7+" ]");
        System.out.println("8 [N control = "+m8 + " Nombre: "+n8+" Calificacion 1 = "+c8
        +" Calificacion 2 = "+c82+" Calificacion 3 = "+c83+" Promedio = "+p8+" ]");
        System.out.println("9 [N control = "+m9 + " Nombre: "+n9+" Calificacion 1 = "+c9
        +" Calificacion 2 = "+c92+" Calificacion 3 = "+c93+" Promedio = "+p9+" ]");
        System.out.println("10 [N control = "+m0 + " Nombre: "+n0+" Calificacion 1 = "+c0
        +" Calificacion 2 = "+c02+" Calificacion 3 = "+c03+" Promedio = "+p0+" ]");
    }
}
