package unidad4.Grafos;

/**
 *
 * @author xztrece
 */
public class CaminosMinimos {

    public String algoritmoFloyd(long[][] mAdy) {
        int vertices = mAdy.length;
        long martrizAdyacencia[][] = mAdy;
        String caminos[][] = new String[vertices][vertices];
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminoRecorrido = "", cadena = "", caminitos = "";
        int i, j, k;
        float temporal1, temporal2, temporal3, temporal4, minimo;

        //Inicializando las matrices caminos y caminos auxiliares
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                caminosAuxiliares[i][j] = "";
                caminos[i][j] = "";
            }
        }
        for (k = 0; k < vertices; k++) {
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    temporal1 = martrizAdyacencia[i][j];
                    temporal2 = martrizAdyacencia[i][k];
                    temporal3 = martrizAdyacencia[k][j];
                    temporal4 = temporal2 + temporal3;
                    //Encontrando el camino minimo
                    minimo = Math.min(temporal1, temporal4);
                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminoRecorrido = "";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminoR(i, k, caminosAuxiliares, caminoRecorrido) + (k + 1);
                        }
                    }
                    martrizAdyacencia[i][j] = (long) minimo;
                }
            }
        }
        //Regresando al camino a cadena
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                cadena += "[" + martrizAdyacencia[i][j] + "] ";
            }
            cadena += "\n";
        }
        //---------------------------------------------------------
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                if (martrizAdyacencia[i][j] != 1000000000) {
                    if (i != j) {
                        if (caminos[i][j].equals("")) {
                            caminitos += "De (" + (i + 1) + " --> " + (j + 1) + ") Irse por ... (" + (i + 1) + ", " + (j + 1) + ")\n";
                        } else {
                            caminitos += "De (" + (i + 1) + " --> " + (j + 1) + ") Irse por ... (" + (i + 1) + ", " + (caminos[i][j]) + ", " + (j + 1) + ")\n";
                        }
                    }
                }
            }
        }
        return "La matriz de caminos Mas cortos entre los diferentes vertices es :\n " + cadena
                + "\nLos diferentes caminos mas cortos entre vertices son:\n"
                + caminitos;
    }

    public String caminoR(int i, int k, String[][] caminosAuxiliares, String caminoRecorrido) {
        if (caminosAuxiliares[i][k].equals("")) {
            return "";
        } else {
            //Recursividad al millon
            caminoRecorrido += caminoR(i, Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares, caminoRecorrido) + (Integer.parseInt(caminosAuxiliares[i][k].toString()) + 1) + ", ";
            return caminoRecorrido;
        }
    }
}
