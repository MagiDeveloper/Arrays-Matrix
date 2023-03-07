package com.example.arreglos.model;

public class matrizexample {
    public static void main(String[] args) {

        int[][]matrizexample = {{7, 3, 7}, {7, 3, 7}, {7, 3, 7}};

        for (int i = 0; i < matrizexample.length; i++) {
            for (int j = 0; j < matrizexample[0].length; j++) {
                System.out.print(matrizexample[i][j] + " ");
            }
            System.out.println();
        }
    }

}
