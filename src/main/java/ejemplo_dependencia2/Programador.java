package ejemplo_dependencia2;

public class Programador {
    String pc;
    String language;

    public Programador() {
        this.pc = new Mac().getNombre();
        this.language = new Python().getLanguage();
    }

//    public Programador(String pc, String language) {
//        this.pc = pc;
//        this.language = language;
//    }
}
