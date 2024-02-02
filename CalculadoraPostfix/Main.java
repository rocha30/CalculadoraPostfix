package CalculadoraPostfix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase principal que utiliza la implementación de CalculatorTest para evaluar expresiones en notación postfix
 * leídas desde un archivo de texto.
 */
public class Main {
    /**
     * Método principal que realiza la evaluación de expresiones en notación postfix desde un archivo de texto.
     */
    public static void main(String[] args) {
        // Crea una instancia de la implementación de CalculatorTestADT
        Calculadora calculator = new Calculadora();

        // Ruta del archivo que contiene expresiones en notación postfix (asegúrate de que la ruta sea correcta).
        String filePath = "datosPostfix.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Lee cada línea del archivo y evalúa la expresión en notación postfix.
            while ((line = reader.readLine()) != null) {
                int result = calculator.evaluate(line);
                // Imprime el resultado de la evaluación junto con la expresión original.
                System.out.println("Expresión: " + line + " = " + result);
            }
        } catch (IOException e) {
            // Manejo de excepciones en caso de error de lectura del archivo.
            e.printStackTrace();
        }
    }
}