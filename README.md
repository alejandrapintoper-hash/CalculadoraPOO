# Calculadora Sencilla (POO)

Proyecto ACA Final - Programacion Orientada a Objetos.

## Estudiante

- Nombre: Alejandra Pinto Perez

## Descripcion

Aplicacion de consola desarrollada en Java que funciona como una calculadora
sencilla. Permite sumar, restar, multiplicar y dividir dos numeros,
controlando el error de dividir entre cero. Ademas guarda un historial de
todas las operaciones realizadas y permite mostrarlo. Toda la informacion se
maneja en memoria, sin base de datos ni interfaz grafica.

## Funcionalidades (menu)

1. Sumar
2. Restar
3. Multiplicar
4. Dividir (controla la division entre cero)
5. Ver historial de operaciones
6. Salir

## Clases utilizadas

- **Operacion**: clase de objeto. Representa una operacion
  (operando1, operador, operando2, resultado). Tiene atributos privados,
  constructor, getters/setters y el metodo mostrarInformacion().
- **Calculadora**: clase contenedora. Tiene los metodos de las operaciones
  (sumar, restar, multiplicar, dividir) y guarda un ArrayList<Operacion> con
  el historial, que recorre en el metodo mostrarHistorial().
- **DivisionPorCeroException**: excepcion personalizada que se lanza al
  intentar dividir entre cero.
- **Main**: clase principal con el menu por consola.

## Conceptos de POO aplicados

| Concepto | Donde se aplica |
|---|---|
| Clases y objetos | Operacion, Calculadora |
| Atributos y metodos | todas las clases |
| Encapsulamiento (private + getters/setters) | Operacion, Calculadora |
| Relacion entre clases | Calculadora contiene objetos Operacion |
| Arreglos | arreglo "operaciones" en Main |
| Listas y recorrido | ArrayList<Operacion> recorrido en mostrarHistorial() |
| try-catch | validacion del menu y de los numeros en Main |
| Excepcion personalizada | DivisionPorCeroException |
| Menu por consola | Main |

## Como ejecutar

Necesitas tener instalado el JDK (Java 8 o superior).