import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //PEDIR UN CALOR
        System.out.println("Solicitar Numero 1");
        int num1 = scanner.nextInt();

        for (int i = 1; i<=num1; i++){
            if(i % 2 == 0){
                System.out.println("El número: " + i + " es Par");
            }else{
                System.out.println("El número: " + i + " es Impar");
            }
        }

        scanner.close();
    }
}