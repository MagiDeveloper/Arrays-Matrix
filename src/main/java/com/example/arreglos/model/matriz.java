package com.example.arreglos.model;

public class matriz {
    public static void main(String[] args) {

        int[][] matriz = {{7, 7, 7}, {3, 3, 3}, {7, 7, 7}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // agrega una nueva línea después de imprimir cada fila
        }

    }
}