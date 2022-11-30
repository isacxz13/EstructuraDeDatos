package unidad2.pruebas1;

/**
 *
 * @author xztrece
 */
public class recursividadMetodos {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int sumatoria(int n){
        if(n == 1){
            return 1;
        }else{
            return n + sumatoria(n-1);
        }
    }
}
