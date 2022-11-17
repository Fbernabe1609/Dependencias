package org.example.ejemplo_dependencia;

public class A {
    B b = new B();
    public float tenPercent() {
        return (float) (b.sum() * 0.1);
    }
}
