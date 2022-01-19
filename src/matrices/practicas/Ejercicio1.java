package matrices.practicas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanio = 1;
        System.out.print("Ingrese el tamaño de la matriz: ");
        try {
            tamanio = input.nextInt();
            if (tamanio== 0){
                System.err.println("ERROR");
                System.exit(1);
            }
        } catch (NumberFormatException e) {
            System.err.println("Solo se permite valores de tipo numerico!!!");
            System.exit(1);
        }


        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == j || j == tamanio-i-1) {
                    System.out.print("x");
                } else {
                    System.out.print("_");
                }

            }
            System.out.println();
        }
    }
}
