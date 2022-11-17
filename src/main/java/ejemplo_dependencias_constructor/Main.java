package ejemplo_dependencias_constructor;

public class Main {
    public static void main(String[] args) {
        A a = new A(new B());
        System.out.println(a.tenPercent());;
    }
}
