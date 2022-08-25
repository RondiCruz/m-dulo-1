import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        
        float salBase = 0;
       float salFinal = 0;
       Scanner leitor = new Scanner(System.in);

       System.out.println("Digite o salario base");
       salBase = Float.parseFloat(leitor.nextLine());
       salFinal = salBase - (salBase * 2f / 100f);
       System.out.println("O salario final e " + salFinal);
    
      } 

    }
    

