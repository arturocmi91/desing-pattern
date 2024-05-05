package StructuralDesingPatterns.Bridge.Actions;

public class NonCommercialActionImp implements  Actions{
    @Override
    public void connect() {
        System.out.println( " Conectado al puerto I.02 de libre conexión ");
    }

    @Override
    public void insertModule() {
        System.out.println( " Se ha insertado en Tarjeta Rasberry X001 ");
    }
}
