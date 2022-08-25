import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
         
        float precoproduto = 0;
        float valdesc = 0;
        float novopreco = 0;
         
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        float precproduto1 = Float.parseFloat(leitor.nextLine());

        valdesc = (precproduto1 * 10F) / 100f;
        novopreco = (precproduto1 - valdesc);

        System.out.println(" O valor do desconto é de:" + valdesc);
        System.out.println(" o valor do novo preço é de: " + novopreco);

        leitor.close();
    }
    
}
