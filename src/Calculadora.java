import java.util.ArrayList;

public class Calculadora {

    // Lista que guarda todas las operaciones realizadas (el historial)
    private ArrayList<Operacion> historial = new ArrayList<>();

    // Sumar
    public double sumar(double a, double b) {
        double resultado = a + b;
        historial.add(new Operacion(a, "+", b, resultado));
        return resultado;
    }

    // Restar
    public double restar(double a, double b) {
        double resultado = a - b;
        historial.add(new Operacion(a, "-", b, resultado));
        return resultado;
    }

    // Multiplicar
    public double multiplicar(double a, double b) {
        double resultado = a * b;
        historial.add(new Operacion(a, "*", b, resultado));
        return resultado;
    }

    // Dividir (controla el error de dividir entre cero)
    public double dividir(double a, double b) throws DivisionPorCeroException {
        if (b == 0) {
            throw new DivisionPorCeroException("No se puede dividir entre cero.");
        }
        double resultado = a / b;
        historial.add(new Operacion(a, "/", b, resultado));
        return resultado;
    }

    // Muestra todas las operaciones del historial (recorrido de la lista)
    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("Todavia no se ha realizado ninguna operacion.");
            return;
        }
        System.out.println("----- HISTORIAL DE OPERACIONES -----");
        for (Operacion op : historial) {
            op.mostrarInformacion();
        }
        System.out.println("Total de operaciones: " + historial.size());
    }
}