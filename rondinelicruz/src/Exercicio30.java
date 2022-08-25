import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
         
     float valsalario = 0;
     float novosalario = 0;
     Scanner leitor = new Scanner(System.in);

     System.out.println(" Digite o valor do salário");
     valsalario = Float.parseFloat(leitor.nextLine());

     if (valsalario <= 500){
         // Então tem direito ao aumento
         novosalario = valsalario + (valsalario * 30f / 100f);
         System.out.println("O novo salario e " + novosalario);
     }else{
         System.out.println("Voce não tem direito a o aumento");
     }
    }
    
}
