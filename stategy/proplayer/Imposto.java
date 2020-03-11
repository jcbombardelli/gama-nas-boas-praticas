package stategy.proplayer;

public interface Imposto {
    double calcular();
}

class ICMS implements Imposto {

    private double valor;

    public ICMS(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0.10;
    }

}

class IPI implements Imposto {

    private double valor;

    public IPI(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return this.valor = 0.20;
    }

}