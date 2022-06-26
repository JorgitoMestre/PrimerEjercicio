package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!"); ->
        /*   Video 8
        CollectionApp obj=new CollectionApp();
        obj.llenarLista();
        obj.getLista().forEach(System.out::println);
        System.out.println("-----------");
        obj.usarSort();
        obj.usarForEach();
        System.out.println("-----------");
        obj.usarRemoveIf();
        */
/* video 9
        StreamsApp obj9= new StreamsApp();
        obj9.filtrar();
        System.out.println("-------");
        obj9.ordenar();
        System.out.println("-------");
        obj9.transformar();
        System.out.println("-------");
        obj9.contar();
 */
        StreamsApp prueba= new StreamsApp();
      // System.out.println(prueba.filtrar());
        List<Persona> l2= new ArrayList<>();

        l2.forEach(System.out::println);
        prueba.llenarPersonas();
        l2=prueba.listaPer();
        l2.stream().map(x->x.getNombre()).forEach(System.out::println);

        /* video 10
        optionalApp obj10=new optionalApp();
        //obj10.orElse("mito");
        obj10.orElseThrow(null);
        //obj10.isPresent("mito");

         */

    }
}