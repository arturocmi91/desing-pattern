package StructuralDesingPatterns.adapter;

public class DeltaAdapter implements Automaton {

   private Delta delta;

    public DeltaAdapter() {
        this.delta= new Delta();
    }

    @Override
    public void connect() {

        //Logica necesaria

        delta.deltaOn();

    }

    @Override
    public void disconnect() {
        //Logica necesaria
        delta.deltaOff();

    }

    @Override
    public void sendData(String data) {
        //Logica necesaria
        delta.deltaInfo(data);

    }

    @Override
    public void receiveData(String data) {
        //Logica necesaria
        delta.deltaClear(data);
    }
}
