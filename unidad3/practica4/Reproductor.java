package unidad3.practica4;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author xztrece
 */
public class Reproductor {

    //Iniciacion de variables de la clase
    private static final Reproduccion lista = new ListaReproduccion();
    private static Cancion newCancion;
    private static final Scanner consola = new Scanner(System.in);
    private static int option2;
    private static int indice;
    private static String nombre;
    private static String genero;
    private static double tiempo;

    public static void main(String[] args) {
        try (consola) {
            Cancion cancio1 = new Cancion(5.42, "Adelante", "Pop");
            Cancion cancio2 = new Cancion(5.43, "Adentro", "Mariachi");
            Cancion cancio3 = new Cancion(5.44, "Afuera", "Sierrenio");
            Cancion cancio4 = new Cancion(5.45, "Atras", "Banda");
            Cancion cancio5 = new Cancion(5.45, "Zembra", "Banda");
            Cancion cancio6 = new Cancion(5.45, "Jiji", "Pop");
            Cancion cancio7 = new Cancion(5.45, "Zuku", "Rap");
            lista.agregar(cancio6);
            lista.agregar(cancio4);
            lista.agregar(cancio3);
            lista.agregar(cancio2);
            lista.agregar(cancio1);
            lista.agregar(cancio5);
            lista.agregar(cancio7);
            
            int option;
            do {
                System.out.print("""
                                          Menu        
                                 
                                 1.-Reproductor
                                 2.-Lista de reproduccion
                                 3.-Salir
                                     Opcion >> """);
                String str = consola.next();
                option = convertionInt(str);
                switch (option) {
                    case 1 ->
                        reproductor();
                    case 2 ->
                        listaReproductor();
                    case 3 ->
                        System.out.println("Saliendo");
                    default ->
                        System.out.println("La opcion indicada no fue encontrada");
                }
            } while (option != 3);
        }catch (InputMismatchException e) {
            System.out.println("Entrada de datos incorrectos");
        }catch(NoSuchElementException e){
            System.out.println("La lista está vacía");
        }catch(NullPointerException e){
            System.out.println("Colección especificada es nula");
        }catch(IndexOutOfBoundsException e){
            System.out.println("índice está fuera de rango ( índice < 0 || índice >= tamaño() )");
        }
    }

    protected static void reproductor() {
        do{
            System.out.println("       \n\n\nReproductor");
            System.out.print("""

                             1.-Reproducir lista lineal
                             2.-Reproduccion lista aleatoria
                             3.-Reproducir cancion
                             4.-Regresar
                                 Opcion >> """);
            String str = consola.next();
            option2 = convertionInt(str);
            switch (option2) {
                case 1 -> {
                    if (lista.estado()) {
                        System.out.println("No hay canciones que reproducir");
                    } else {
                        lista.reproducirLineal();
                    }
                }
                case 2 -> {
                    if (lista.estado()) {
                        System.out.println("No hay canciones que reproducir");
                    } else {
                        lista.reproducirAleatoria();
                    }
                }
                case 3 -> {
                    if (lista.estado()) {
                        System.out.println("No hay canciones en la lista");
                    } else {
                        System.out.print("Nombre cancion >> ");
                        nombre = consola.next();
                        indice = lista.where(nombre,2);
                        if(indice >= 0){
                            lista.buscar(indice);
                        }else{
                            System.out.println("La cancion no se encuentra en la lista");
                        }
                    }
                }
                case 4 -> {
                }
                default ->
                    System.out.println("La opcion indicada no fue encontrada");
            }
        }while(option2 != 4);
    }
    
    protected static void listaReproductor() {
        do {
            System.out.println("      \n\n\n       Lista de reproduccion\n");
            System.out.print("""
                             1.-Agregar nueva cancion
                             2.-Eliminar cancion
                             3.-Eliminar toda la lista
                             4.-Revisar numero de canciones
                             5.-Ver lista
                             6.-Regresar
                             
                                 Opcion >> """);
            String str = consola.next();
            option2 = convertionInt(str);
            switch (option2) {
                case 1 -> {
                    System.out.print("Nombre >> ");
                    nombre = consola.next();
                    
                    System.out.print("Tiempo reproduccion >> ");
                    String str2 = consola.next();
                    tiempo = convertirDouble(str2);
                    System.out.print("Genero >> ");
                    genero = consola.next();
                    newCancion = new Cancion(tiempo, nombre, genero);
                    if (lista.agregar(newCancion)) {
                        System.out.println("Cancion Agregada con exito [" + newCancion.getNombre() + "] ");
                    } else {
                        System.out.println("No se pudo agregar la cancion");
                    }
                }
                case 2 -> {
                    System.out.print("Nombre >> ");
                    String indice2 = consola.next();
                    if (lista.estado()) {
                        System.out.println("No hay canciones para eliminar");
                    } else {
                        if(lista.eliminar(indice2)){
                            System.out.println("Cancion eliminada [ " + indice2 + " ]");
                        }else{
                            System.out.println("Cancion no encontrada en la lista");
                        }
                    }
                }
                case 3 -> {
                    if (lista.estado()) {
                        System.out.println("No hay canciones para eliminar");
                    } else {
                        lista.eliminarAll();
                        if (lista.estado()) {
                            System.out.println("TODAS las canciones eliminadas con exito");
                        } else {
                            System.out.println("No se eliminaron las canciones");
                        }
                    }
                }
                case 4 -> System.out.println("Cantidad de canciones {" + lista.contar() + "]");
                case 5 -> {
                    if (lista.estado()) {
                        System.out.println("No hay canciones que reproducir");
                    } else {
                        menuVerLista();
                    }
                }
                default -> System.out.println("La opcion indicada no fue encontrada");
            }
        } while (option2 != 6);
    }
    
    protected static void menuVerLista(){
        do{
            System.out.println("      \n\n\n       Lista\n");
            System.out.print("""
                         1.-Ver lista original
                         2.-Ver lista Orden Alfabetico
                         3.-Ver lista Orden inverso Alfabetico
                         4.-Regresar
                             Opcion >> """);
            String str = consola.next();
            option2 = convertionInt(str);
            switch (option2) {
                case 1 -> lista.verLista();
                case 2 -> lista.ordenCanciones(option2);
                case 3 -> lista.ordenCanciones(option2);
                case 4 -> System.out.println("Regresando");
                default -> System.out.println("Opcion no encontrada");
            }
        }while(option2 != 4);
    }
    
    private static int convertionInt(String str){
        boolean isNumeric = str.matches("[+-]?\\d*(\\.\\d+)?");
        if(isNumeric){
            double date1  = Double.parseDouble(str);
            int entero = (int)date1;
            return entero;
        }else{
            return -1;
        }
    }
    private static double convertirDouble(String str){
        boolean isNumeric = str.matches("[+-]?\\d*(\\.\\d+)?");
        if(isNumeric){
            double date1  = Double.parseDouble(str);
            return date1;
        }else{
            return -1;
        }
    }
}
