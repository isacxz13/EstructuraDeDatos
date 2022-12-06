package unidad3.practica4;

/**
 *
 * @author xztrece
 */
public class Cancion {

    private double tiempo;
    private String nombre;
    private String genero;

    public Cancion(double tiempo, String nombre, String genero) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.genero = genero;
    }

    public double getTiempo() {
        return tiempo;
    }
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "[  " + nombre + "  ] "+tiempo+" min ("+genero+")";
    }
}
