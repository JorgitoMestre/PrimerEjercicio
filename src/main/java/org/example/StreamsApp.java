package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApp {
    private List<String> lista;
    private List<String> numeros;
    private List<Integer> numeros1;
    private List<Persona> misPersonas;

    public StreamsApp(){
        lista= new ArrayList<>() ;
        lista.add("MitoCode");
        lista.add("Code");
        lista.add("Mito");
        lista.add("Jorge");
        lista.add("Jge");
        lista.add("JçRorge");
        lista.add("Rorge");

        numeros= new ArrayList<>();
        numeros.add("1");
        numeros.add("2");

        numeros1= new ArrayList<>();
        numeros1.add(5);
        numeros1.add(6);
    }

    public void filtrar(){
        lista.stream().filter(x->x.startsWith("M")).forEach(System.out::println); //devuelve todos los valores de la lista q empiezan on M
        lista.stream().filter(x->x.matches("jorge")).forEach(System.out::println);// devuelve de la lista el elemento llamado jorge
        lista.stream().filter(x->x.startsWith("g",1)).forEach(System.out::println); //devuelve de la lista el elemento con la letra g en la 2 pos
        /*List<String> l2= new ArrayList<>();
        l2=lista.stream().filter(x->x.startsWith("g",1)).toList();
        return l2;*/

    }
    public List<Persona> listaPer(){
        this.misPersonas.stream().map(x->x.getNombre()).forEach(System.out::println);
        System.out.println("------");
       misPersonas.stream().map(x->x.getNombre().toUpperCase()).forEach(System.out::println);
       System.out.println("------");
        return misPersonas.stream().filter(x->x.getNombre().startsWith("r",2)).toList();
    }

    public void llenarPersonas(){
        misPersonas=new ArrayList<>();
        this.misPersonas.add(new Persona(1,"jorge"));
        this.misPersonas.add(new Persona(2,"beatriz"));
        this.misPersonas.add(new Persona(3,"sofia"));
        this.misPersonas.add(new Persona(4,"margot"));
    }

    public void ordenar(){
       lista.stream().sorted().forEach(System.out::println); //ordena la lista de manera ascendente
        lista.stream().sorted((x,y)->(y.compareTo(x))).forEach(System.out::println); //ordena la lista de manera descendente
    }

    public void transformar(){
        lista.stream().map(String::toUpperCase).forEach(System.out::println); //convierte a mayuscula todas las cadenas dentro de la lista
        numeros.stream().map(x-> Integer.parseInt(x)+1).forEach(System.out::println); //convierte a entero cada elemento de la lista y luego lo imprime
        numeros1.stream().map(x->String.valueOf(x)).forEach(System.out::println); //convierte a string cda entero de la lista
    }

    public void limitar(){
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar(){
        long x=lista.stream().count();
        System.out.println(x);
    }
}
