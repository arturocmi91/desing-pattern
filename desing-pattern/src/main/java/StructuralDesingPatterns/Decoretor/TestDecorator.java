package StructuralDesingPatterns.Decoretor;

import StructuralDesingPatterns.Decoretor.Decorator.AuditServiceDecorator;
import StructuralDesingPatterns.Decoretor.Decorator.BasicSecurityServiceDecorator;
import StructuralDesingPatterns.Decoretor.Service.AutomationTask;
import StructuralDesingPatterns.Decoretor.Service.Service;
import StructuralDesingPatterns.Decoretor.Service.VirtualAssistance;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("========AutomationTask with Basic Security===========");
        Service robotina= new BasicSecurityServiceDecorator(new AutomationTask());
        robotina.loadData();
        System.out.println("========VirtualAssistance with All Package===========");
        Service pedrito= new BasicSecurityServiceDecorator(new AuditServiceDecorator(new VirtualAssistance()));
        pedrito.loadData();
    }
}
