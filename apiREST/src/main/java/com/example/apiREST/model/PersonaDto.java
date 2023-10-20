package com.example.apiREST.model;

public class PersonaDto {

    public String nombre;
    public String apellido;
    public Integer edad;

    // create construc and getter and setter
    public PersonaDto(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public PersonaDto() {
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", edad=" + edad + ", nombre=" + nombre + "]";
    }

}
