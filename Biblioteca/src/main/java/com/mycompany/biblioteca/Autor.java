package com.mycompany.biblioteca;
import java.util.ArrayList;
import java.util.Date;
public class Autor {
    private ArrayList<Libro> arrLibros;
    public String nombre, nacionalidad;
    public Date fechaNacimiento;

    public Autor(Libro libro, String nombre, String nacionalidad, Date fechaNacimiento) {
        this.arrLibros.add(libro);
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
