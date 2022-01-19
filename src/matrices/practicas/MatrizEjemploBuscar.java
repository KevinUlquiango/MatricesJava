package matrices.practicas;

public class MatrizEjemploBuscar {
    public static void main(String[] args) {
        int[][] matrizDeEntero = {
                {35, 90, 1978},
                {15, 2020, 10, 5},
                {677, 127, 254, 745}
        };

        int elementoBuscar = 15;
        boolean encontrado = false;
        int i;
        /*etiqueta*/
        /*usando la etiqueda sale del for al encontrar el elemento */
        buscar: for (i = 0; i <matrizDeEntero.length;  i++) {
            for (int j = 0; j <matrizDeEntero[i].length; j++) {
                if (matrizDeEntero[i][j] == elementoBuscar){
                    encontrado = true;
                     break buscar;
                }
            }

        }

        if(encontrado){
            System.out.println("Encontrado " + elementoBuscar + " en cordenada " + i);
        }else{
            System.out.println("No se encontro en la matriz");
        }


    }
}
