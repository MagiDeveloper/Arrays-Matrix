package com.example.arreglos.model;

import java.util.Arrays;

public class Numerosmasuno {

    public static void main(String[] args) {
        int[] Numerosmasuno = new int[100];

        for (int i = 0; i < Numerosmasuno.length; i++) {
            Numerosmasuno[i] =i + 1;
        }
        for (int i = 0; i < Numerosmasuno.length; i++) {
            Numerosmasuno[i] += 1;
        }
        System.out.println("El arreglo con dos sumados a cada elemento es: " + Arrays.toString(Numerosmasuno));
    }
}
