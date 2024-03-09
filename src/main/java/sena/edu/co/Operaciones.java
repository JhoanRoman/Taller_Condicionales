package sena.edu.co;
import java.util.Scanner;

public class Operaciones {
    public static double calcularAreaTriangulo(double dato1, double dato2) {
        return (dato1 * dato2) / 2;
    }

    public static double sumarNumeros(double dato1, double dato2) {
        return dato1 + dato2;
    }

    public static double elevarAlCuadrado(double dato1) {
        return dato1 * dato1;
    }

    public static double eurosADolares(double dato1) {
        return dato1 * 1.08;
    }

    public static void calcularAreaPerimetroCuadrado(double dato1) {
        double area = dato1 * dato1;
        double perimetro = 4 * dato1;
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }

    public static void calcularAreaVolumenCilindro(double dato1, double dato2) {
        double area = 2 * Math.PI * dato1 * (dato1 + dato2);
        double volumen = Math.PI * dato1 * dato1 * dato2;
        System.out.println("El área del cilindro es: " + area);
        System.out.println("El volumen del cilindro es: " + volumen);
    }

    public static void calcularLongitudAreaCircunferencia(double dato1) {
        double longitud = 2 * Math.PI * dato1;
        double area = Math.PI * dato1 * dato1;
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo inscrito es: " + area);
    }

    public static double calcularPromedio(double dato1, double dato2, double dato3) {
        return (dato1 + dato2 + dato3) / 3;
    }

    public static String determinarPositivoNegativo(double dato1) {
        if (dato1 > 0) {
            return "El número ingresado es positivo";
        } else if (dato1 < 0) {
            return "El número ingresado es negativo";
        } else {
            return "El número ingresado es cero";
        }
    }

    public static void encontrarMayorMenor(double dato1, double dato2) {
        if (dato1 > dato2) {
            System.out.println("El mayor número es: " + dato1);
            System.out.println("El menor número es: " + dato2);
        } else if (dato1 < dato2) {
            System.out.println("El mayor número es: " + dato2);
            System.out.println("El menor número es: " + dato1);
        } else {
            System.out.println("Los dos números son iguales");
        }
    }

    public static void encontrarMayorMenorTresNumeros(double dato1, double dato2, double dato3) {
        double mayor = Math.max(dato1, Math.max(dato2, dato3));
        double menor = Math.min(dato1, Math.min(dato2, dato3));
        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);
    }

    public static double sumarOrestar(double dato1, double dato2) {
        if (dato1 < dato2) {
            return dato1 + dato2;
        } else {
            return dato1 - dato2;
        }
    }

    public static String cocienteEntreAB(double dato1, double dato2) {
        if (dato2 == 0) {
            return "La división por cero no está definida";
        } else {
            return "El cociente entre A y B es: " + (dato1 / dato2);
        }
    }

    public static double sumarOMultiplicar(double dato1, double dato2) {
        if (dato1 < 0 || dato2 < 0) {
            return dato1 + dato2;
        } else {
            return dato1 * dato2;
        }
    }

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
