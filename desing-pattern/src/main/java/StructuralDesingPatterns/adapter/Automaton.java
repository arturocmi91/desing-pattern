package StructuralDesingPatterns.adapter;

public interface Automaton {
    void connect();
    void disconnect();
    void sendData(String data);
    void receiveData(String data);

}
