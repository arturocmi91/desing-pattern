package StructuralDesingPatterns.Facade;

public class TestFacade {
    public static void main(String[] args) {
        MainComputer computer= new MainComputer();
        Printer printer= new Printer();
        Lights lights= new Lights();

        OfficeFacade office= new OfficeFacade(computer, printer, lights);

        office.startingWorkingDay();

        computer.openApp(" Antivirus ");
        printer.printerDocument(" Reportes.doc ");
        lights.dim(50);
    }




}
