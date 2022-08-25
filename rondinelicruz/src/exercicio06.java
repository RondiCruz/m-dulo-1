import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        float qtdporrefeicao = 0;
        int   numrefeicoesdia = 0;
        float qtdtotalracao = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a qtd por refeição");
        qtdporrefeicao = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o numero de refeições por dia");
        numrefeicoesdia = Integer.parseInt(leitor.nextLine());

        qtdtotalracao = (qtdporrefeicao * numrefeicoesdia) * 30f;

        System.out.println("A qtd total de ração e: " + qtdtotalracao);


        

        
    }
    
}
