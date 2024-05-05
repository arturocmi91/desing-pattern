package StructuralDesingPatterns.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        DeltaAdapter delta= new DeltaAdapter();

        delta.connect();
        delta.disconnect();
        delta.sendData("O.1 ON, 0.2 OFF");
        delta.receiveData("O.1 ON, 0.2 OFF");


    }
}

