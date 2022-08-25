import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        
        float valreais = 0;
        float valdolar = 0;
        float  valmarcoalemao = 0;
        float  vallibras = 0;
         Scanner leitor = new Scanner(System.in);

         // ENTRADA
         System.out.println(" Digite o valor em reais");
         valreais = Float.parseFloat(leitor.nextLine());

         // PROCESSAMENTO
         valdolar = valreais / 1.8f;
         valmarcoalemao = valreais / 2f;
         vallibras = valreais / 1.57f;

         //SAÍDA
         System.out.println(" O valor do dolar e " + valdolar);
         System.out.println(" O valor do marco e " + valmarcoalemao);
         System.out.println(" O valor da libra e " + vallibras );



    }
    
}
