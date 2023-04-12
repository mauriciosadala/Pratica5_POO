public abstract class PoligonoRegular {

    public int numLado;
    public double tamLado;

    public PoligonoRegular(int numLados, double tamLado) {
        this.numLado = numLados;
        this.tamLado = tamLado;
    }

    public abstract double calcularArea();

    public double calcularPerimetro() {
        return numLado * tamLado;
    }
}
