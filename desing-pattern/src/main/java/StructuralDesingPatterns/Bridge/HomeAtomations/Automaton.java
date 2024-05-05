package StructuralDesingPatterns.Bridge.HomeAtomations;

import StructuralDesingPatterns.Bridge.Actions.Actions;

import javax.swing.*;

public abstract class Automaton {

    protected String signal;
    protected Actions actions;

    public Actions getActions() {
        return actions;
    }

    public Automaton setActions(Actions actions) {
        this.actions = actions;
        return this;
    }

    public String getSignal() {
        return signal;
    }

    public Automaton setSignal(String signal) {
        this.signal = signal;
        return this;
    }
}
