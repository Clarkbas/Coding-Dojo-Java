package Calculadora1;

public class BeansCalculator {

	
    private double operand1;
    private double operand2;
    private String operation;
    private double result;
    
    
    // Metodos 
    
    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    	// La estructura de control switch en Java permite tomar decisiones basadas 
    	// en el valor de una expresión y ejecutar diferentes bloques de código dependiendo de los casos coincidentes.
    public void performOperation() {
        switch (operation) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }
    }
    
    // Cuando llamo al metodo getResults() quisiera que me retorne la operación realizada más  abajo.
    public double getResult() {
        return result;
    }

    public static void main(String[] args) {
    	BeansCalculator calculator = new BeansCalculator();
        calculator.setOperand1(10.5);
        calculator.setOperand2(5.2);
        calculator.setOperation("+");
        calculator.performOperation();
        double result = calculator.getResult();
        System.out.println("El resultado es: " + result);
    }
}








