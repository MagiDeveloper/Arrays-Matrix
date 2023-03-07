package com.example.arreglos.model;

public class Numeros {
    public static void main(String[] args) {

        int[] Numeros = new int[100];

        for(int i = 0; i< Numeros.length; i++ ){
            Numeros [i] = i + 1;
        }
        int suma = 0;
        for (int i = 0; i < Numeros.length; i++){
            suma += Numeros [i];
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }


}
