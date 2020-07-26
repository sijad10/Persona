package com.mycompany.persona;

public class Persona {
    int codigo;
    String nombre;
    String profesion;
    String fecha;

    public Persona() {
    }

    public Persona(String nombre, String profesion) {
        this.nombre = nombre;
        this.profesion = profesion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
