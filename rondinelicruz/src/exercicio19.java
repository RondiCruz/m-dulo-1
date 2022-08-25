import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        
        float largura = 0;
        float comprimento = 0;
        float area = 0;
        float potencia = 0;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a largura");
        largura = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o comprimento");
        comprimento = Float.parseFloat(leitor.nextLine());

        area = largura * comprimento;
        potencia = 18f * area;

        System.out.println("A area é " + area);
        System.out.println("A potencia é " + potencia);
    }
    
}
