package StructuralDesingPatterns.Facade;

import java.util.ArrayList;
import java.util.List;

public class MainComputer {
    private boolean isOn= false;
    private List<String> openedApps= new ArrayList<>();

    public void turnOn(){
        if(!isOn){
            isOn=true;
            System.out.println("  PC Principal encendida ");
        }else{
            System.out.println("Ya la  PC Principal esta encendida ");
        }
    }
    public void turnOff(){
        if (isOn){
            isOn=false;
            System.out.println(" Apagando la  PC Principal ");
        }else {
            System.out.println(" Ya la  PC Principal esta apagada ");
        }
    }

    public void openApp(String app){
        if (isOn){
            openedApps.add(app);
            System.out.println(" Abriendo: " + app + " de la PC Principal " );
        }else{
            System.out.println(" No se puede abrir: " + app + " . La PC Principal está apagada ");
        }
    }
}
