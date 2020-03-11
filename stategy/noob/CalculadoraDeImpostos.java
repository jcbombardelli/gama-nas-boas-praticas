package stategy.noob;

public class CalculadoraDeImpostos {

    public double calcular(String imposto, double valor) {
        if (imposto.equals("ICMS"))
            return valor * 0.10;
        else if (imposto.equals("IPI"))
            return valor * 0.20;
        else if (imposto.equals("NOVO_IMPOSTO"))
            return valor * 0.50;
        return valor;
    }

    public CalculadoraDeImpostos() {
        super();
    }
}