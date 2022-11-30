package unidad2.pruebas1;

/**
 *
 * @author xztrece
 */
public class recursividad1 {
    public static void main(String[] args) {
        System.out.println("Decreciente");
        cuenta(1);
        System.out.println("\n\nIncrementable");
        cuenta1(10);
    }
    public static void cuenta(int n){
        if(n < 10){
            cuenta(n+1);
        }
        System.out.println(n);
    }
    public static void cuenta1(int n){
        if(n > 1){
            cuenta1(n-1);
        }
        System.out.println(n);
    }
}
