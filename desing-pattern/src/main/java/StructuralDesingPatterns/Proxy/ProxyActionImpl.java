package StructuralDesingPatterns.Proxy;

import java.util.Date;

public class ProxyActionImpl implements Action{
    private Stats stats;
    private ActionImp actionImp;

    public ProxyActionImpl( ActionImp actionImp) {

        this.actionImp = actionImp;
    }

    public Stats getStats() {
        return stats;
    }

    public ProxyActionImpl setStats(Stats stats) {
        this.stats = stats;
        return this;
    }

    public ActionImp getActionImp() {
        return actionImp;
    }

    public ProxyActionImpl setActionImp(ActionImp actionImp) {
        this.actionImp = actionImp;
        return this;
    }

    @Override
    public void save(String name) {
        stats.setLastAct(new Date());
        actionImp.setStats(stats);
        actionImp.save(name);
    }

    @Override
    public Stats load(String name) {
        Stats stats= getActionImp().load(name);
        setStats(stats);
        return stats;
    }
}
