package com.mycompany.persona;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("------------------");
            System.out.println("1. Crear persona");
            System.out.println("2. Leer peronas");
            System.out.println("3. Editar persona");
            System.out.println("4. Borrar persona");
            System.out.println("5. Salir");
            x = sc.nextInt();
            switch (x) {
            case 1:
                Servicio.crearPersona();
                break;
            case 2:
                Servicio.leerPersona();
                break;
            case 3:
                Servicio.editarPersona();
                break;
            case 4:
                Servicio.borrarPersona();
                break;
            case 5:
                System.out.println("Bye!!");
                break;
        }
        } while (x != 5);
    }

}
