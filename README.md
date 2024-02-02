**Calculadora en Notación Postfix**

Este proyecto implementa una calculadora que evalúa expresiones en notación postfix. La evaluación se realiza utilizando una pila y sigue la lógica de la notación postfix, donde los operadores siguen a sus operandos.

**Clases Principales**

Calculadora (Calculadora.java)
  Esta clase implementa la interfaz CalculatorADT y proporciona la lógica para evaluar expresiones en notación postfix. Utiliza una pila (VectorStack) para realizar el seguimiento de los operandos y operadores durante la evaluación.

CalculatorTest (CalculadoraTest.java)
 
 Esta clase contiene pruebas unitarias utilizando JUnit para verificar el correcto funcionamiento de la Calculadora. Incluye pruebas para expresiones simples, expresiones complejas, divisiones y expresiones que contienen números negativos.

Main (Main.java)
 
 La clase principal del programa que lee expresiones en notación postfix desde un archivo de texto (datos.txt) y utiliza la implementación de CalculatorADT para evaluarlas. Los resultados se imprimen en la consola.

**Interfaz y Estructuras de Datos**

CalculatorADT (CalculatorADT.java)
  Esta interfaz define el contrato para la evaluación de expresiones en notación postfix.

Stack (Stack.java)
  
Una interfaz que representa una pila genérica con operaciones como push, pop, peek, isEmpty, y size.

VectorStack (VectorStack.java)
  
Una implementación de la interfaz Stack que utiliza la clase Vector de Java para almacenar elementos. Se utiliza en la Calculadora para gestionar la pila durante la evaluación.

**Cómo Usar**

Clona o descarga el proyecto.
Ejecuta la clase Main para evaluar expresiones desde el archivo datos.txt.
Observa los resultados en la consola.
