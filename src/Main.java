import java.util.Scanner;
import FigurasRegulares.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objetos sin valores iniciales
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();

        // Valores seteados sus parametros con valores ingresados
        // por el usuario mediante teclado desde el main
        System.out.println();
        System.out.println("---------Figuras geometricas-----");
        System.out.println();

        //Cuadrado
        System.out.println("Cuadrado");
        System.out.print("Ingrese el lado del cuadrado: ");
        cuadrado.setLado(scanner.nextDouble());
        System.out.println();

        //Rectangulo
        System.out.println("Rectangulo");
        System.out.print("Ingrese el largo del rectángulo: ");
        rectangulo.setLargo(scanner.nextDouble());
        System.out.print("Ingrese el ancho del rectángulo: ");

        rectangulo.setAncho(scanner.nextDouble());
        System.out.println();

        //Circulo
        System.out.println("Circulo");
        System.out.print("Ingrese el radio del círculo: ");
        circulo.setRadio(scanner.nextDouble());
        System.out.println();

        //Triangulo
        System.out.println("Triangulo");
        System.out.print("Ingrese la base del triángulo: ");
        triangulo.setBase(scanner.nextDouble());
        System.out.print("Ingrese la altura del triángulo: ");
        triangulo.setAltura(scanner.nextDouble());
        System.out.println();

        // Calcular y mostrar perímetros y áreas
        System.out.println("-------------Perímetros y Áreas----------------");
        System.out.println();
        System.out.println("Cuadrado Perímetro: " + cuadrado.calcularPerimetroCuadrado() + ", Área: " + cuadrado.calcularAreaCuadrado());
        System.out.println();
        System.out.println("Rectángulo Perímetro: " + rectangulo.calcularPerimetroRectangulo() + ", Área: " + rectangulo.calcularAreaRectangulo());
        System.out.println();
        System.out.println("Círculo Perímetro: " + circulo.calcularPerimetroCirculo() + ", Área: " + circulo.calcularAreaCirculo());
        System.out.println();
        System.out.println("Triángulo Perímetro: " + triangulo.calcularPerimetroTriangulo() + ", Área: " + triangulo.calcularAreaTriangulo());
        System.out.println();

        // Calcular y mostrar la suma de las áreas
        double sumaAreas = cuadrado.calcularAreaCuadrado() + rectangulo.calcularAreaRectangulo() + circulo.calcularAreaCirculo() + triangulo.calcularAreaTriangulo();
        System.out.println("Suma de las áreas de las 4 figuras es : " + sumaAreas);
    }
}
