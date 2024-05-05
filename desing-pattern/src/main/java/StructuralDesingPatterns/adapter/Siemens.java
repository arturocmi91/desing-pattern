package StructuralDesingPatterns.adapter;

public class Siemens implements  Automaton{
    @Override
    public void connect() {
        System.out.println("Se ha conectado el automata Siemens");
    }

    @Override
    public void disconnect() {

        System.out.println("Se ha desconectado el automata Siemens");

    }

    @Override
    public void sendData(String data) {
        System.out.println("Se ha enviado la data  al automata Siemens");

    }

    @Override
    public void receiveData(String data) {

        System.out.println("Se ha autalizado la data del automata Siemens");

    }
}
