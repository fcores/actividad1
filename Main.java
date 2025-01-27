import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try {
            // Solicitar entrada de datos
            String inputNum1 = JOptionPane.showInputDialog("Ingresar Número 1:");
            String inputNum2 = JOptionPane.showInputDialog("Ingresar Número 2:");
            String operacion = JOptionPane.showInputDialog("Ingresar el tipo de operación (suma, resta, multiplicacion, division):");

            // Convertir a números
            double num1 = Double.parseDouble(inputNum1);
            double num2 = Double.parseDouble(inputNum2);

            // Validar entrada de operación y realizar cálculo
            String resultado;
            switch (operacion.toLowerCase()) {
                case "suma":
                    resultado = "Resultado: " + (num1 + num2);
                    break;
                case "resta":
                    resultado = "Resultado: " + (num1 - num2);
                    break;
                case "multiplicacion":
                    resultado = "Resultado: " + (num1 * num2);
                    break;
                case "division":
                    if (num2 != 0) {
                        resultado = "Resultado: " + (num1 / num2);
                    } else {
                        resultado = "Error: No se puede dividir entre cero.";
                    }
                    break;
                default:
                    resultado = "Operación no válida. Intente con suma, resta, multiplicacion o division.";
            }

            // Mostrar resultado
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Entrada no válida. Por favor, ingrese números válidos.");
        }
    }
}