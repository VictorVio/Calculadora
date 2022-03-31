package calculadora;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public void basicOperations (){
        boolean repetir = true;
        while (repetir){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero");

            float float1 = scan.nextFloat();
            System.out.println("Digite um sinal");
            String sinal = scan.next();

            while (!Objects.equals(sinal, "+") && !Objects.equals(sinal, "-") && !Objects.equals(sinal, "*") && !Objects.equals(sinal, "/") ) {
                System.out.println("Digite um sinal válido * / + -");
                sinal = scan.next();
            }
            System.out.println("Digite outro numero");

            float float2 = scan.nextFloat();
            float total = 0;
            switch (sinal) {
                case "+":
                    total = float1 + float2;
                    break;
                case "-":
                    total = float1 - float2;
                    break;
                case "*":
                    total = float1 * float2;
                    break;
                case "/":
                    total = float1 / float2;
                    break;
            }
            System.out.print("O seu resultado é ");
            System.out.println(total);
            System.out.println("Digite 'sim' para continuar");
            String continuar = scan.next();

            if (!Objects.equals(continuar, "sim")) {
                repetir = false;
                System.out.println("Encerrando...");
            }
        }
    }
}
