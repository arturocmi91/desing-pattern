package StructuralDesingPatterns.Bridge.HomeAtomations;

import StructuralDesingPatterns.Bridge.Actions.Actions;
import StructuralDesingPatterns.Bridge.Actions.NonCommercialActionImp;

public class ModuleNonCommercial extends Automaton  {
    public ModuleNonCommercial() {
        setActions(new NonCommercialActionImp());
    }

    @Override
    public String getSignal() {
        return super.getSignal();
    }

    @Override
    public Actions getActions() {
        return super.getActions();
    }

    @Override
    public Automaton setActions(Actions actions) {
        return super.setActions(actions);
    }

    @Override
    public Automaton setSignal(String signal) {
        return super.setSignal(signal);
    }


    public void connect() {
        System.out.println("MDL001: ");
        getActions().connect();
    }


    public void insertModule() {

        System.out.println("Module: " );
        getActions().insertModule();

    }
}
