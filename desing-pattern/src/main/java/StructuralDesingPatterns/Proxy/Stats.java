package StructuralDesingPatterns.Proxy;

import java.io.Serializable;
import java.util.Date;

public class Stats implements Serializable {

private static final long serialVersionUID= 1L;
private  String name;
private int level;
private int contribution;
private int delete;
private Date createdAct;
private Date lastAct;

    public Stats(String name, int level, int contribution, int delete) {
        this.name = name;
        this.level = level;
        this.contribution = contribution;
        this.delete = delete;
    }

    public String getName() {
        return name;
    }

    public Stats setName(String name) {
        this.name = name;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Stats setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getContribution() {
        return contribution;
    }

    public Stats setContribution(int contribution) {
        this.contribution = contribution;
        return this;
    }

    public int getDelete() {
        return delete;
    }

    public Stats setDelete(int delete) {
        this.delete = delete;
        return this;
    }

    public Date getCreatedAct() {
        return createdAct;
    }

    public Stats setCreatedAct(Date createdAct) {
        this.createdAct = createdAct;
        return this;
    }

    public Date getLastAct() {
        return lastAct;
    }

    public Stats setLastAct(Date lastAct) {
        this.lastAct = lastAct;
        return this;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", contribution=" + contribution +
                ", delete=" + delete +
                ", createdAct=" + createdAct +
                ", lastAct=" + lastAct +
                '}';
    }
}
