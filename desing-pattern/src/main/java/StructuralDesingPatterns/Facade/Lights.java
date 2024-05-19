package StructuralDesingPatterns.Facade;

public class Lights {
    private boolean areOn = false;
    private int brightnessLevel = 0;

    public void turnOn() {
        if (!areOn) {
            areOn = true;
            brightnessLevel = 100;
            System.out.println(" Luces encendidas al 100% ");
        } else {
            System.out.println(" Ya estan encendidas ");
        }

    }

    public void turnOff() {
        if (areOn) {
            areOn = false;
            brightnessLevel = 0;
            System.out.println(" Luces apagadas ");
        } else {
            System.out.println(" Ya estan apagadas ");
        }

    }

    public void dim(int level){
        if(areOn){
            if(level>=0 && level<= 100){
                brightnessLevel= level;
                System.out.println(" Luces atenuadas a: " + level + " % ");
            }else {
                System.out.println(" No se te puede atenuar. Las luces estan Apagadas ");
            }
        }
    }
}
