package unidad4.Grafos;

/**
 *
 * @author xztrece
 */
public class TestGrafos {

    public static void main(String[] args) {
        long matriz[][] = {{0,3,4,2,7},
                           {3,0,4,6,3},
                           {4,4,0,5,8},
                           {2,6,5,0,6},
                           {7,3,8,6,0}};
        CaminosMinimos caminos = new CaminosMinimos();
        System.out.println(caminos.algoritmoFloyd(matriz));
    }
}
