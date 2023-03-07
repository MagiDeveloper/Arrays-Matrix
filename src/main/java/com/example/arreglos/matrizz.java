package com.example.arreglos;

import java.util.Random;

public class matrizz {
    public static void main(String[] args) {

        int[][] matrizz = new int[4][4];

        Random random = new Random();
        for (int i = 0; i < matrizz.length; i++) {
            for (int j = 0; j < matrizz[0].length; j++) {
                matrizz[i][j] = random.nextInt(10);
            }
            System.out.println("Matrizz:");
            for (i = 0; i < matrizz.length; i++) {
                for (int j = 0; j < matrizz[0].length; j++) {
                    System.out.print(matrizz[i][j] + " ");
                }
                System.out.println();

            }
            for (i = 0; i < matrizz.length; i++) {
                int sumaFila = 0;
                for (int j = 0; j < matrizz[0].length; j++) {
                    sumaFila += matrizz[i][j];
                }
                System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
            }
            for (int j = 0; j < matrizz[0].length; j++) {
                int sumaColumna = 0;
                for (i = 0; i < matrizz.length; i++) {
                    sumaColumna += matrizz[i][j];
                }
                System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
            }
        }
    }
}








