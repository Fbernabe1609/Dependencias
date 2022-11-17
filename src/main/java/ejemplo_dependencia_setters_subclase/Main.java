package ejemplo_dependencia_setters_subclase;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        BHija bHija = new BHija();
        a.setB(bHija);
        System.out.println(a.tenPercent());;
    }
}
