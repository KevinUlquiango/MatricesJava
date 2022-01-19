package matrices.practicas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la dimension del arreglo: ");
        int tamanioArreglo=0;
        try {
            tamanioArreglo = input.nextInt();
            if (tamanioArreglo ==0 ){
                System.out.println("ERROR");
                System.exit(1);
            }
        }catch (Exception e) {
            System.out.println("Solo se permite datos de tipo numerico");
            System.exit(1);
        }
        for (int i = 0; i <tamanioArreglo ; i++) {
            for (int j = 0; j <tamanioArreglo ; j++) {
                if (j == 0 || tamanioArreglo/2 ==i || (tamanioArreglo/2 <i && j==tamanioArreglo-1)){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
