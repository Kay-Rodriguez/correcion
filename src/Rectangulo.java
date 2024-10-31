package FigurasRegulares;

public class Rectangulo {
    double largo;
    double ancho;

    // Constructor sin parámetros
    public Rectangulo() {}

    // Constructor con parámetros
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Setters y Getters
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    // Método para calcular el perímetro
    public double calcularPerimetroRectangulo() {
        return 2 * (largo + ancho);
    }

    // Método para calcular el área
    public double calcularAreaRectangulo() {
        return largo * ancho;
    }
}
