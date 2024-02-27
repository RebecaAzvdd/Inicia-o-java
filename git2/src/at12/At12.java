package at12;

import java.util.Scanner;

public class At12 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("Digite o nome do cliente:");
            String nome1 = scanner.nextLine();
            
            System.out.println("Digite a sua idade:");
            int idade1 = scanner.nextInt();
            
            scanner.nextLine();
            
            System.out.println("Digite o segundo nome:");
            String nome2 = scanner.nextLine();
            
            System.out.println("Digite a idade do segundo cliente:");
            int idade2 = scanner.nextInt();
            
            if(idade1 > idade2){
                System.out.println(nome1 + " ficará no quarto A e " + nome2 + " ficará no quarto B");
                
            }else if (idade2 > idade1){
                System.out.println(nome2 + " ficará no quarto A e " + nome1 + " ficará no quarto B");
                
            }if (idade1 >= 60){
                System.out.println(nome1 + " ganhará 40% de desconto");
                
            }if (idade2 >= 60){
                System.out.println(nome2 + " ganhará 40% de desconto");
            }
        }
    }   
}
