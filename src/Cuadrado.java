
package FigurasRegulares;
public class Cuadrado {
    double lado;
    public Cuadrado() {}

    // Constructor con parámetros
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    // Setter y Getter
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetroCuadrado() {
        return 4 * lado;
    }

    // Método para calcular el área
    public double calcularAreaCuadrado() {
        return lado * lado;
    }
}
