package ejemplo_dependencia_setters_simple;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.setB(b);
        System.out.println(a.tenPercent());;
    }
}
