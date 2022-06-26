package org.example;
import java.util.*;
///////////////     Clase perteneciente al video 8,
public class CollectionApp {
    private List<String> lista;

    public void llenarLista(){
        lista=new ArrayList<String>();
        lista.add("MitoCode");
        lista.add("Code");
        lista.add("Mito");
        lista.add("jorge");
    }
    public void usarForEach(){
        /* Esto es lo tradicional
        for (String e: this.lista)
            System.out.println(e);*/
        /*Expresiones lambda
        lista.forEach(x->System.out.println(x)); */

       // Refrencia a metodos  (imprime todos los elementos de una lista)
        lista.forEach(System.out::println);
    }

    public void usarRemoveIf(){
       /* Forma tradicional
        Iterator<String> it= lista.iterator();
        while (it.hasNext())
           if(it.next().equals("Code")){
              it.remove();

              lista.forEach(System.out::println);

        }*/
        //Elimina el elemento Code de la lista lista y luego imprime la lista
        lista.removeIf(x->x.equals("Code"));
        lista.forEach(System.out::println);
    }

    public void usarSort(){
        lista.sort((x,y)->x.compareTo(y)); //ordena alfabeticamente la lista
    }

    List <String> getLista(){
        return this.lista;
    }

}
