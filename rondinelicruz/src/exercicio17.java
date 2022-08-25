import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        
        float valsalario = 0;
        float valconta1 = 0;
        float valconta2 = 0;
        float valmulta1 = 0;
        float valmulta2 = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o valor do salario do João");
        valsalario = Float.parseFloat(leitor.nextLine());
        System.out.println(" Digite o valor da primeira conta");
        valconta1 = Float.parseFloat(leitor.nextLine());
        System.out.println(" Digite o valor da segunda conta");
        valconta2 = Float.parseFloat(leitor.nextLine());

        valmulta1 = (valconta1 * 2f) / 100f;
        valmulta2 = (valconta2 * 2f) / 100f;
        valsalario -= (valconta1 + valconta2 + valmulta1 + valmulta2);

        System.out.println( " O salario restante e: " + valsalario);

    }
    
}
