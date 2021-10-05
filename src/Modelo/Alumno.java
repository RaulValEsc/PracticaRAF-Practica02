/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Alumno {
    /*
        id = 4
        nombre = 40 char[20]
        double = 8
        fecha = 16 char[8]
    */
    int id;
    String nombre;
    Double nota;
    Date fecha;

    public Alumno(int id, String nombre, Double nota, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
