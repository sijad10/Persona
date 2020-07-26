package com.mycompany.persona;

import java.util.Scanner;

public class Servicio {

    public static void crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la profesion: ");
        String profesion = sc.nextLine();
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setProfesion(profesion);
        Dao.crearPersonaDB(persona);
    }

    public static void leerPersona() {
        Dao.leerPersonaDB();
    }

    public static void borrarPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ID: ");
        int x = sc.nextInt();
        Dao.borrarPersonaDB(x);
    }

    public static void editarPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el PROFESION: ");
        String men = sc.nextLine();
        System.out.println("Ingrese el ID: ");
        int id = sc.nextInt();
        Persona pe = new Persona();
        pe.setCodigo(id);
        pe.setProfesion(men);
        Dao.editPersonaDB(pe);

    }
}
