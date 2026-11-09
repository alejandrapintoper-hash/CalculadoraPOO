public class Operacion {

    // Atributos (los datos de la operación) - privados por encapsulamiento
    private double operando1;
    private String operador;
    private double operando2;
    private double resultado;

    // Constructor: le da valores al objeto cuando se crea
    public Operacion(double operando1, String operador, double operando2, double resultado) {
        this.operando1 = operando1;
        this.operador = operador;
        this.operando2 = operando2;
        this.resultado = resultado;
    }

    // Getters y setters
    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    // Método que muestra la información de la operación
    public void mostrarInformacion() {
        System.out.println(operando1 + " " + operador + " " + operando2 + " = " + resultado);
    }
}


