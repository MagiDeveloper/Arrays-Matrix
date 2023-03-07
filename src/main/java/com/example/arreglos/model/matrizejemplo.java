package com.example.arreglos.model;

public class matrizejemplo {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        matriz[0][0] = 7;
        matriz[0][1] = 3;
        matriz[0][2] = 3;
        matriz[1][0] = 7;
        matriz[1][1] = 3;
        matriz[1][2] = 3;
        matriz[2][0] = 7;
        matriz[2][1] = 3;
        matriz[2][2] = 3;

      for (int i=0; i< matriz.length; i++) {
          for (int j=0; j<matriz[0].length;j++) {
              System.out.print(matriz[i][j] + " ");
          }
          System.out.println();

      }

    }
}

