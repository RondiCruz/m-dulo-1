import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        
        float  salminimo = 0;
        float  qtdqwconsumida = 0;
        float  valqw = 0;
        float  valpago = 0;
        float  valpagodesc = 0;
         Scanner leitor = new Scanner( System.in);
         // Entrada

         System.out.println(" Digite o valor do salario minimo");
         salminimo = Float.parseFloat(leitor.nextLine());
         System.out.println(" Digite a quantidade consumida de Quilowatts");
         qtdqwconsumida = Float.parseFloat(leitor.nextLine());

         // Processamento

         valqw = salminimo / 5f;
         valpago = valqw * qtdqwconsumida;
         valpagodesc = (valpago * 85f) / 100f;
         
         // Saída

         System.out.println(" O valor unitário do Quilowatt" + valqw);
         System.out.println(" O valor pago e" + valpago);
         System.out.println(" O valor com desconto de 15% e" + valpagodesc);



         
    }
    
}
