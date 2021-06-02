    import java.util.Locale;
    import java.util.Scanner;

    public class Teste {
        public static void main(String[] args) {
            Triangle triangle1 = new Triangle();
            triangle1.lado1 = 3.0;
            triangle1.lado2 = 4.0;
            triangle1.lado3 = 5.0;
            triangle1.calcularArea();

            Triangle triangle2 = new Triangle();
            triangle2.lado1 = 1.50;
            triangle2.lado2 = 4.50;
            triangle2.lado3 = 4.02;
            triangle2.calcularArea();

            System.out.printf("Triangle 1 area: %.4f%n", triangle1.area);

            System.out.printf("Triangle 2 area: %.4f%n", triangle2.area);
            triangle1.quemTemMaiorArea(triangle2);
        }
    }

    class Triangle{
        double lado1;
        double lado2;
        double lado3;
        double area;

        public double calcularArea(){

            double p = (lado1+lado2+lado3)/2;
            area = Math.sqrt(p * (p-lado1) * (p - lado2) * (p-lado3));

            return area;
        }

        public void quemTemMaiorArea(Triangle t){
            System.out.println(t.area > area ? "Triangulo 2 tem a maior area" : "Triangulo 1 tem a maior area");
        }
    }