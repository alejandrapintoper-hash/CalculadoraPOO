import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        // Arreglo simple con las operaciones disponibles
        String[] operaciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};

        int opcion = 0;

        do {
            System.out.println("=================================");
            System.out.println("        CALCULADORA SENCILLA");
            System.out.println("=================================");

            // Recorrido del arreglo para mostrar el menu
            for (int i = 0; i < operaciones.length; i++) {
                System.out.println((i + 1) + ". " + operaciones[i]);
            }
            System.out.println("5. Ver historial");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            // try-catch 1: validar que la opcion sea un numero
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero valido.\n");
                continue;
            }

            switch (opcion) {
                case 1:
                    operar(scanner, calculadora, "+");
                    break;
                case 2:
                    operar(scanner, calculadora, "-");
                    break;
                case 3:
                    operar(scanner, calculadora, "*");
                    break;
                case 4:
                    operar(scanner, calculadora, "/");
                    break;
                case 5:
                    calculadora.mostrarHistorial();
                    break;
                case 6:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
            System.out.println();

        } while (opcion != 6);

        scanner.close();
    }

    // Pide dos numeros y ejecuta la operacion indicada
    private static void operar(Scanner scanner, Calculadora calculadora, String operador) {
        try {
            System.out.print("Ingrese el primer numero: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese el segundo numero: ");
            double b = Double.parseDouble(scanner.nextLine());

            double resultado = 0;
            switch (operador) {
                case "+":
                    resultado = calculadora.sumar(a, b);
                    break;
                case "-":
                    resultado = calculadora.restar(a, b);
                    break;
                case "*":
                    resultado = calculadora.multiplicar(a, b);
                    break;
                case "/":
                    resultado = calculadora.dividir(a, b);
                    break;
            }
            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            // try-catch 2: entrada no numerica
            System.out.println("Error: debe ingresar numeros validos.");
        } catch (DivisionPorCeroException e) {
            // aqui se atrapa tu excepcion personalizada
            System.out.println("Error: " + e.getMessage());
        }
    }
}