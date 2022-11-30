package unidad3.practica4;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author xztrece
 */
public class ListaReproduccion implements Reproduccion {
    private LinkedList<Cancion> canciones;

    public ListaReproduccion() {
        this.canciones = new LinkedList();
    }
    
    @Override
    public boolean agregar(Cancion cancion) {
        return this.canciones.add(cancion);
    }

    @Override
    public Cancion eliminar(int x) {
        return this.canciones.remove(x);
    }

    @Override
    public void eliminarAll() {
        this.canciones.clear();
    }

    @Override
    public int contar() {
        return this.canciones.size();
    }

    @Override
    public void reproducirLineal() {
        for(Cancion cancion: this.canciones){
            System.out.println("Reproduciendo: "+cancion);
            esperar(3);
        }
    }
    
    @Override
    public void verLista() {
        int i= 0;
        for(Cancion cancion: this.canciones){
            System.out.println("ID = "+(i++)+" "+cancion);
        }
    }
    
    @Override
    public void reproducirAleatoria() {
        int rango = contar();
        int x = rango + 1;
        int y = rango;
        ArrayList numeros = new ArrayList();
        while(rango != 0){
            boolean flag = true;
            while(flag){
                x = (int) (Math.random() * y);
                if(numeros.contains((Integer) x)) {
                    x = (int) (Math.random() * y);
                }else{
                    numeros.add((Integer) x);
                    flag = false;
                }
            }
            System.out.println("Reproduciendo: "+this.canciones.get((Integer) x));
            esperar(3);
            rango --;
        }
    }

    @Override
    public boolean estado() {
        return this.canciones.isEmpty();
    }
    
    public void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (InterruptedException e) {
            System.out.println(e);
         }
    }  
    
    @Override
    public int where(String name) {
        int x=0;
        boolean flag=false;
        for(Cancion cancion: this.canciones){
            if(name.equalsIgnoreCase(cancion.getNombre())){
                flag = true;
                break;
            }
            x++;
        }if(flag){
            return x;
        }else{
            return -1;
        }
    }
    
    @Override
    public void buscar(int indice){
        System.out.println("Reproduciendo: "+canciones.get(indice));
        esperar(3);
    }
}
