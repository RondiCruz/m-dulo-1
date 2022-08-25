import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        
        float pesokg = 0;
        float pesogramas = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o peso em kg ");
        pesokg = Float.parseFloat(leitor.nextLine());

        pesogramas = pesokg * 1000;

        System.out.println(" O peso em gramas é " + pesogramas);


    }
    
}
