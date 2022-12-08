package unidad3.practica4;

import java.util.LinkedList;

/**
 *
 * @author xztrece
 */
public interface Reproduccion {
    //Metodos para la lista de reproduccion
    
    //Agregar canciones
    public boolean agregar(Cancion cancion);
    
    //Eliminar canciones
    public boolean eliminar(String x);
        
    //Limpiar lista completa
    public void eliminarAll();
    
    //Revisar numero de canciones
    public int contar();
    
    //Ver lista completa
    public void verLista();
            
    //Reproducir canciones orden lineal
    public void reproducirLineal();
    //Reproducir canciones orden aleatorio
    public void reproducirAleatoria();
    
    //Revisar estado de la lista
    public boolean estado();
    
    //Buscar cancion
    public void buscar(String dato,int option);
    
    //Ordena canciones en orden alfabetico
    public void ordenCanciones(int option);
}
