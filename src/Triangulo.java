
package FigurasRegulares;
public class Triangulo {
    double base;
    double altura;

    // Constructor sin parámetros
    public Triangulo() {}

    // Constructor con parámetros
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Setters y Getters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Método para calcular el perímetro
    public double calcularPerimetroTriangulo() {
        return 3 * base;
    }

    // Método para calcular el área
    public double calcularAreaTriangulo() {
        return (base * altura) / 2;
    }

}
