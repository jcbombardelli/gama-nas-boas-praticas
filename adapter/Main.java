package adapter;

public class Main {

    public static void main(String[] args) {
    }

}

class TomadaDeDoisPinos {
    public void ligarNaTomadaDeDoisPinos() {
        System.out.println("Ligado na Tomada de Dois Pinos");
    }
}

class TomadaDeTresPinos {
    public void ligarNaTomadaDeTresPinos() {
        System.out.println("Ligado na Tomada de Tres Pinos");
    }
}

class AdapterTomada extends TomadaDeDoisPinos {
    private TomadaDeTresPinos tomadaDeTresPinos;

    public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }

    public void ligarNaTomadaDeDoisPinos() {
        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
    }
}