package unidad3.practica4;

/**
 *
 * @author xztrece
 */
public interface Reproduccion {
    //Metodos para la lista de reproduccion
    
    //Agregar canciones
    public boolean agregar(Cancion cancion);
    
    //Eliminar canciones
    public Cancion eliminar(String x);
        
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
    
    //Regresa indice del objeto
    public int where(String name, int option);
    
    //Buscar cancion
    public void buscar(int indice);
    
    //Ordena canciones en orden alfabetico
    public void ordenCanciones(int option);
}
