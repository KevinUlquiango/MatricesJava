package matrices.practicas;

public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        boolean esSimetrica = true;
        simetrica: for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                     break simetrica;
                }
            }
        }
        String respuesta;
        respuesta = esSimetrica ? "La matriz es simetrica":"La matriz no es simetrica";
        System.out.println(respuesta);
    }
}
