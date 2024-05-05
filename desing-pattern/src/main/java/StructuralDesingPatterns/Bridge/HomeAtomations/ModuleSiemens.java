package StructuralDesingPatterns.Bridge.HomeAtomations;

import StructuralDesingPatterns.Bridge.Actions.Actions;
import StructuralDesingPatterns.Bridge.Actions.SiemensActionImp;

public class ModuleSiemens extends  Automaton {

    public ModuleSiemens() {
        setActions(new SiemensActionImp());
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
        System.out.println("Siemens: " );
        getActions().connect();
    }


    public void insertModule() {
        System.out.println("Siemens's Modules: ");
        getActions().insertModule();

    }
}
