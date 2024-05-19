package StructuralDesingPatterns.Facade;

public class Printer {
    private boolean isOn = false;

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(" Impresora encendida ");
        } else {
            System.out.println(" La impresora ya esta encendida ");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(" Impresora apagada ");
        } else {
            System.out.println(" La impresora ya esta apagada ");
        }
    }

    public void printerDocument(String document){
        if(isOn){
            System.out.println("  imprimiendo: " + document);
        }else{
            System.out.println(" No se puede imprimir " + document + " La impresora está apagada ");
        }
    }
}
