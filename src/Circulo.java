package FigurasRegulares;

public class Circulo {
    double radio;

    // Constructor sin parámetros
    public Circulo() {}

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Setter y Getter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    // Método para calcular el perímetro
    public double calcularPerimetroCirculo() {
        return 2 * 3.141593 * radio;
    }

    // Método para calcular el área
    public double calcularAreaCirculo() {
        return Math.PI * radio * radio;
    }
}

