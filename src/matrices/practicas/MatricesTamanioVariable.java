package matrices.practicas;

public class MatricesTamanioVariable {
    public static void main(String[] args) {
        int[][] matrices = new int[3][];

        matrices[0] = new int[2];
        matrices[1] = new int[3];
        matrices[2] = new int[4];

        System.out.println("Matriz length: " + matrices.length);
        System.out.println("Fila 0 tamaño: " + matrices[0].length);
        System.out.println("Fila 1 tamaño: " + matrices[1].length);
        System.out.println("Fila 2 tamaño: " + matrices[2].length);

        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length; j++) {
                System.out.print(matrices[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
