package StructuralDesingPatterns.Bridge.Actions;

public class SiemensActionImp implements Actions{
    @Override
    public void connect() {
        System.out.println(" Se ejecutó en la I022 del equipo autorizado ");
    }

    @Override
    public void insertModule() {
        System.out.println( "Modulo aceptado SIEMENS PCL 3200 " );
    }
}
