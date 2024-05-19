package StructuralDesingPatterns.Facade;

public class OfficeFacade {
    private MainComputer mainComputer;
    private Printer printer;
    private Lights lights;

    public OfficeFacade(MainComputer mainComputer, Printer printer, Lights lights) {
        this.mainComputer = mainComputer;
        this.printer = printer;
        this.lights = lights;
    }

    public void startingWorkingDay(){
        System.out.println( " Preparando la Oficina" );
        lights.turnOn();
        lights.dim(70);
        mainComputer.turnOn();
        mainComputer.openApp(" Login app ");
        printer.turnOn();
        printer.printerDocument(" Prueba : Blank ");
    }
     public void finishedWorkingDay(){
         System.out.println(" Cerrando la oficina ");
        lights.turnOff();
        mainComputer.turnOff();
        printer.turnOff();
     }

}
