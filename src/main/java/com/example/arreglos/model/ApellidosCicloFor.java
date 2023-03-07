package com.example.arreglos.model;

public class ApellidosCicloFor {
    public static void main(String[] args) {

        String[] apellidos = new String[5];

        apellidos[0] = "Labrada";
        apellidos[1] = "Garcia";
        apellidos[2] = "Gonzalez";
        apellidos[3] = "Saldaña";
        apellidos[4] = "Lozano";

        for (int i = 0; i < apellidos.length; i++) {
            System.out.println(apellidos[i]);
        }
    }
}
