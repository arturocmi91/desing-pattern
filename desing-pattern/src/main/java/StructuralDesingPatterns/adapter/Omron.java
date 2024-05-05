package StructuralDesingPatterns.adapter;

public class Omron implements Automaton {
    @Override
    public void connect() {
        System.out.println("Se ha conectado el automata Omron ");
    }

    @Override
    public void disconnect() {

        System.out.println("Se ha desconectado el automata Omron ");

    }

    @Override
    public void sendData(String data) {
        System.out.println("Se ha enviado la data  al automata Omron ");

    }

    @Override
    public void receiveData(String data) {

        System.out.println("Se ha autalizado la data del automata Omron ");

    }
}
