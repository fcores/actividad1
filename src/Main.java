//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [][] mat = {{4,5,6},{7,8,9},{5,6,7}};
        float cantidadElementos = 0;
        float suma = 0;

        for(int i=0;i< mat.length;i++) { //complejidad N
            for (int j = 0; j < mat.length; j++) { // complejidad N
                suma = mat[i][j] + suma;
                cantidadElementos++;
            }
        }
        // complejidad n´2
        System.out.println("El promedio es: " + suma/cantidadElementos);
    }
}