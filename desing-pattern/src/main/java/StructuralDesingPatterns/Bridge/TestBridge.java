package StructuralDesingPatterns.Bridge;

import StructuralDesingPatterns.Bridge.Actions.NonCommercialActionImp;
import StructuralDesingPatterns.Bridge.Actions.SiemensActionImp;
import StructuralDesingPatterns.Bridge.HomeAtomations.ModuleNonCommercial;
import StructuralDesingPatterns.Bridge.HomeAtomations.ModuleSiemens;

public class TestBridge {
    public static void main(String[] args) {
        System.out.println("==========================================SIEMENS========================================");
        ModuleSiemens moduleSiemens= new ModuleSiemens();
        moduleSiemens.connect();
        moduleSiemens.insertModule();
        moduleSiemens.setActions(new NonCommercialActionImp());
        moduleSiemens.connect();
        moduleSiemens.insertModule();
        System.out.println("==========================================Tarjeta========================================");
        ModuleNonCommercial moduleNonCommercial= new ModuleNonCommercial();
        moduleNonCommercial.connect();;
        moduleNonCommercial.insertModule();
        moduleNonCommercial.setActions(new SiemensActionImp());
        moduleNonCommercial.connect();
        moduleNonCommercial.insertModule();

    }
}
