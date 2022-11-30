package unidad2.pruebas1.pruebas2;

/**
 *
 * @author xztrece
 */
public class Nose {

    public static void main(String[] args) {
        System.out.println(sumatoriaRecursiva(5));
        System.out.println("\n\n");
        System.out.println(fibonacci(5));
        System.out.println("\n\n");
        System.out.println(factorial(5));
        System.out.println("\n\n");
        System.out.println(potencia(5, 5));
    }
    public static int sumatoriaRecursiva(int num){
        if(num == 1){
            return 1;
        }else{
            return num + sumatoriaRecursiva(num-1);
        }
    }
    
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    public static long fibonacci(int n){
        if(n < 2){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static int potencia(int n, int p){
        if(p == 0){
            return 1;
        }else{
            return n * potencia(n, p-1);
        }
    }
}
