package ejemplo_dependencias_constructor;

public class A {
    B b;

    public void setB(B b) {
        this.b = b;
    }

    public float tenPercent() {
        return (float) (b.sum() * 0.1);
    }
}
