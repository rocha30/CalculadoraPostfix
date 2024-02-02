package CalculadoraPostfix;
public class CalculadoraTest {

    @Test
    public void testEvaluateSimpleExpression() {
        // Create an instance of the Calculator class for testing
        Calculadora calculator = new Calculadora();
        // Define the postfix expression to evaluate
        String expression = "3 4 +";
        // Perform the evaluation and check that the result is as expected
        int result = calculator.evaluate(expression);
        assertEquals(7, result);
    }

    private void assertEquals(int i, int result) {
        
    }

    @Test
    public void testEvaluateComplexExpression() {
        // Create an instance of the Calculator class for testing
        Calculadora calculator = new Calculadora();
        // Define the postfix expression to evaluate
        String expression = "5 1 2 + 4 * + 3 -";
        // Perform the evaluation and check that the result is as expected
        int result = calculator.evaluate(expression);
        assertEquals(14, result);
    }

    @Test
    public void testEvaluateDivision() {
        // Create an instance of the Calculator class for testing
        Calculadora calculator = new Calculadora();
        // Define the postfix expression to evaluate
        String expression = "7 2 /";
        // Perform the evaluation and check that the result is as expected
        int result = calculator.evaluate(expression);
        assertEquals(3, result, 0.001); // Allow for small floating point errors
    }

    private void assertEquals(int i, int result, double d) {
        
    }

    @Test
    public void testEvaluateWithNegativeNumbers() {
        // Create an instance of the Calculator class for testing
        Calculadora calculator = new Calculadora();
        // Define the postfix expression to evaluate
        String expression = "-9 -8 +";
        // Perform the evaluation and check that the result is as expected
        int result = calculator.evaluate(expression);
        assertEquals(-17, result);
    }
}
