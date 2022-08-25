import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        float salfixo=0, valtotalvendas=0, valcomissao=0, valsalfinal=0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário fixo");
        salfixo = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do total de vendas");
        valtotalvendas = Float.parseFloat (leitor.nextLine());

        valcomissao = (valtotalvendas * 4f) / 100f;
        valsalfinal = salfixo + valcomissao;

        System.out.println(" O valor da comissão é:" + valcomissao);
        System.out.println(" O valor do salário final é: " );

    }
    
}
