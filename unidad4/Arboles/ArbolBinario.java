package unidad4.Arboles;

import java.util.TreeSet;

/**
 *
 * @author xztrece
 */
public class ArbolBinario {

    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet arbol = new TreeSet();
        arbol.add(30);
        arbol.add(30);
        arbol.add(63);
        arbol.add(74);
        arbol.add(75);
        arbol.add(81);
        arbol.add(35);
        arbol.add(78);
        arbol.add(81);
        arbol.add(58);
        System.out.println(arbol);
        arbol.remove(63);
        System.out.println(arbol);
    }
    
}
