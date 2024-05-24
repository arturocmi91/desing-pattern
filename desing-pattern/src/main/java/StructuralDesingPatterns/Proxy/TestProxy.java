package StructuralDesingPatterns.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        ActionImp actionImp= new ActionImp();
        actionImp.newAction("Foro_1");
        ProxyActionImpl proxyAction= new ProxyActionImpl(actionImp);
        proxyAction.load("Foro_1");
        System.out.println(proxyAction.getStats());
        proxyAction.getStats().setLevel(1);
        proxyAction.getStats().setContribution(12);
        proxyAction.getStats().setDelete(3);
        proxyAction.save("Foro_1");
        proxyAction.load("Foro_1");
        System.out.println(proxyAction.getStats());

    }
}
