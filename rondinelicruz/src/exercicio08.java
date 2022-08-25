import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        
        float umnumero = 0;
        int intinteiro = 0;
        float numdecimal = 0;
        int numarredondado = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite um numero real ");
        umnumero = Float.parseFloat(leitor.nextLine());
        // Converção de tipo Float para int (com perda de inf)

        intinteiro = (int)umnumero;
        numdecimal = umnumero % 1;
        numarredondado = Math.round(umnumero);
        // numdecimal = umnumero - numinteiro

        System.out.println(" O valor inteiro é: " + intinteiro);
        System.out.println("O valor decimal é: " + numdecimal);
        System.out.println(" O valor arredondado é: "  + numarredondado);



    
    }
    
}
