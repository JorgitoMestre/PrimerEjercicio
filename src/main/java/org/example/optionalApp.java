package org.example;

import java.util.Optional;

//Video 9
public class optionalApp {
    public void probar(String valor){
        //System.out.println(valor.contains("mito"));
        try {
            Optional op= Optional.empty();
            op.get();
        }catch (Exception e){
            System.out.println(valor.contains("No hay elementos"));
        }
    }

    public void orElse(String valor){
        Optional<String> op= Optional.ofNullable(valor);
        String x= op.orElse("predeterminado");
        System.out.println(x);
    }

    public void orElseThrow(String valor){
        Optional <String> op= Optional.ofNullable(valor);
        op.orElseThrow(NumberFormatException::new);
    }

    public  void isPresent(String valor){
        Optional<String> op= Optional.ofNullable(valor);
        System.out.println(op.isPresent());
    }
}
