package sena.edu.co;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu;
        double dato1 = 0, dato2 = 0, dato3 = 0, dato4 = 0; 

        do {
            mostrarMenuPrincipal();
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    // Operadores
                    int opcionOperadores;
                    do {
                        mostrarSubMenuOperadores();
                        opcionOperadores = scanner.nextInt();

                        switch (opcionOperadores) {
                            case 1:
                                System.out.print("Ingrese la base del triángulo: ");
                                double base = scanner.nextDouble();
                                System.out.print("Ingrese la altura del triángulo: ");
                                double altura = scanner.nextDouble();
                                double areaTriangulo = Operaciones.calcularAreaTriangulo(base, altura);
                                System.out.println("El área del triángulo es: " + areaTriangulo);
                                break;
                            case 2:
                                System.out.print("Ingrese el primer número: ");
                                dato1 = scanner.nextDouble(); // Asignamos el valor a dato1
                                System.out.print("Ingrese el segundo número: ");
                                dato2 = scanner.nextDouble(); // Asignamos el valor a dato2
                                double suma = Operaciones.sumarNumeros(dato1, dato2);
                                System.out.println("La suma de los dos números es: " + suma);
                                break;
                            case 3:
                                System.out.print("Ingrese un número para elevar al cuadrado: ");
                                dato3 = scanner.nextDouble(); // Asignamos el valor a dato3
                                double cuadrado = Operaciones.elevarAlCuadrado(dato3);
                                System.out.println("El cuadrado del número es: " + cuadrado);
                                break;
                            case 4:
                                System.out.print("Ingrese la cantidad de euros: ");
                                dato4 = scanner.nextDouble(); // Asignamos el valor a dato4
                                double dolares = Operaciones.eurosADolares(dato4);
                                System.out.println("La cantidad en dólares es: " + dolares);
                                break;
                            case 5:
                                System.out.print("Ingrese el lado del cuadrado: ");
                                double lado = scanner.nextDouble();
                                Operaciones.calcularAreaPerimetroCuadrado(lado);
                                break;
                            case 6:
                                System.out.println("Ingrese la altura del cilindro");
                                double altura2= scanner.nextDouble();
                                System.out.println("Ingrese el radio del cilindro");
                                double radio2= scanner.nextDouble();
                                Operaciones.calcularAreaVolumenCilindro(altura2,radio2);
                                break;
                            case 7:
                                System.out.println("Ingrese el radio de la circunferencia");
                                double radio3= scanner.nextDouble();
                                Operaciones.calcularLongitudAreaCircunferencia(radio3);
                                break;
                            case 8:
                                System.out.println("Ingrese un numero");
                                double num1= scanner.nextDouble();
                                System.out.println("Ingrese el segundo numero");
                                double num2= scanner.nextDouble();
                                System.out.println("Ingrese el tercer numero");
                                double num3= scanner.nextDouble();
                                double promedio = Operaciones.calcularPromedio(num1, num2, num3);
                                System.out.println("El promedio de los tres números es: " + promedio);
                                break;
                            case 9:
                                // Salir del submenú de operadores
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    } while (opcionOperadores != 9);
                    break;
                case 2:
                int opcionCondicionales;
                do {
                    
                    mostrarSubMenuCondicionales();
                    opcionCondicionales = scanner.nextInt();
                    switch (opcionCondicionales) {
                        case 1:
                            System.out.println("Ingrese un numero");
                            double numero1= scanner.nextDouble();
                            System.out.println(Operaciones.determinarPositivoNegativo(numero1));
                            break;
                        case 2:
                            System.out.println("Ingrese un numero");
                            double numero3= scanner.nextDouble();
                            System.out.println("Ingrese otro numero");
                            double numero4= scanner.nextDouble();
                            Operaciones.encontrarMayorMenor(numero3, numero4);
                            break;
                        case 3:
                            System.out.println("Ingrese un numero");
                            double numero5= scanner.nextDouble();
                            System.out.println("Ingrese otro numero");
                            double numero6= scanner.nextDouble();   
                            System.out.println("Ingrese un tercer numero");
                            double numero7= scanner.nextDouble(); 
                            Operaciones.encontrarMayorMenorTresNumeros(numero5, numero6, numero7);
                            break;
                        case 4:
                            System.out.println("Ingrese un numero");
                            double numero8= scanner.nextDouble();
                            System.out.println("Ingrese otro numero");
                            double numero9= scanner.nextDouble();      
                            System.out.println("El resultado es: " + Operaciones.sumarOrestar(numero8, numero9));
                            break;
                        case 5:
                            System.out.println("Ingrese un numero");
                            double numero10= scanner.nextDouble();
                            System.out.println("Ingrese otro numero");
                            double numero11= scanner.nextDouble();      
                            System.out.println(Operaciones.cocienteEntreAB(numero10, numero11));
                            break;
                        case 6:
                            System.out.println("Ingrese un numero");
                            double numero12= scanner.nextDouble();
                            System.out.println("Ingrese otro numero");
                            double numero13= scanner.nextDouble();  
                            System.out.println("El resultado es: " + Operaciones.sumarOMultiplicar(numero12, numero13));
                            break;
                        case 7:
                            System.out.println("Ingrese un año");
                            int numero14= scanner.nextInt();
                            System.out.println("El año es bisiesto: " + Operaciones.esBisiesto((int) numero14));
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }} while(opcionCondicionales !=8);
                    break;
                case 99:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcionMenu != 99);
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("Menú Principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("99. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void mostrarSubMenuOperadores() {
        System.out.println("Operadores");
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("2. Ingresar dos números por teclado y sumarlos");
        System.out.println("3. Ingresar un número y visualizar el número elevado al cuadrado");
        System.out.println("4. Escribir un algoritmo que convierta de euros a dólares");
        System.out.println("5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perímetro");
        System.out.println("6. Escribir un algoritmo que determine el área y el volúmen de un cilindro");
        System.out.println("7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área del círculo inscrito");
        System.out.println("8. Calcular el promedio de tres (3) números ingresados por teclado");
        System.out.println("9. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    public static void mostrarSubMenuCondicionales() {
        System.out.println("Condicionales");
        System.out.println("1. Determinar si un número ingresado por teclado es positivo o negativo");
        System.out.println("2. Determinar cuál es el mayor y cuál es el menor de dos números");
        System.out.println("3. Determinar el menor y el mayor de tres números");
        System.out.println("4. Sumar o restar dos números dependiendo de una condición");
        System.out.println("5. Encontrar el cociente entre dos números");
        System.out.println("6. Sumar o multiplicar dos números dependiendo de una condición");
        System.out.println("7. Determinar si un año es bisiesto");
        System.out.println("8. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }
}
