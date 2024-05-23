package StructuralDesingPatterns.Proxy;

public interface Action {
    void save(String name);
    Stats load(String name);
}
