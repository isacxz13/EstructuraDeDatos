/**
 *
 * @author xztrece
 */

package unidad1.practica2;

public class Estudiante {
    private int matricula;
    private String nombre;
    private int c1,c2,c3;
    private double prom;
    private final int id;
    private static int contadorEstudiante;

    public Estudiante(int matricula, String nombre, int c1, int c2, int c3) {
        this();
        this.matricula = matricula;
        this.nombre = nombre;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    
    public Estudiante() {
        this.id = ++Estudiante.contadorEstudiante;
    }
    
    public double calcularPromedio(){
        this.prom = (this.c1 + this.c2 + this.c3)/3;
        return this.prom;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getC3() {
        return c3;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }

    @Override
    public String toString() {
        return "Estudiante { "+this.id+" [N control = "+this.matricula + " Nombre: "+this.nombre+" Calificacion 1 = "+this.c1
        +" Calificacion 2 = "+this.c2+" Calificacion 3 = "+this.c3+" Promedio = "+calcularPromedio()+" ]" + '}';
    }
}
