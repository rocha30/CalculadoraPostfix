package CalculadoraPostfix;
/**
 * Implementación de la interfaz CalculatorTestADT que evalúa expresiones en notación postfix.
 */
public class Calculadora implements CalculatorADT {

    /**
     * Evalúa una expresión en notación postfix y devuelve el resultado.
     *
     * @param expression La expresión en notación postfix a evaluar.
     * @return El resultado de la evaluación de la expresión.
     */
    @Override
    public int evaluate(String expression) {
        // Utiliza una pila para realizar el seguimiento de los operandos y operadores.
        Stack<Integer> stack = new VectorStack<>();

        // Divide la expresión en tokens utilizando espacios como delimitadores.
        for (String token : expression.split("\\s")) {
            if (token.matches("-?\\d+")) { // Verifica si el token es un número entero.
                stack.push(Integer.parseInt(token));
            } else {
                // Si el token es un operador, realiza la operación correspondiente con los operandos en la pila.
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        // El resultado final se encuentra en la cima de la pila y se devuelve.
        return stack.pop();
    }
}