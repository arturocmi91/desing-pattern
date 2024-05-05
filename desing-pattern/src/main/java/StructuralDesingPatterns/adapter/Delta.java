package StructuralDesingPatterns.adapter;

public class Delta {

    public void deltaOn(){
        System.out.println("Se ha Incializado");
    }
    public void deltaOff(){
        System.out.println("Ha Finalizado");
    }

    public void deltaClear(String data){
        System.out.println("Ha Borrado la info anterior del automata. Se recibio el paquete de informacion " + data );
    }

    public void deltaInfo(String data){
        System.out.println("Se ha enviado el paquete de info " + data + " al automata ");
    }


}
