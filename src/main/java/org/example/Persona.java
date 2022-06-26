package org.example;

public class Persona {
    private int id;
    private String nombre;
    Persona(){
        id=0;
        nombre="";
    }
    Persona(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
}
