import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        
        float salariobase = 0;
        float valimposto = 0;
        float salreceber = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o salario base");
        salariobase = Float.parseFloat(leitor.nextLine());

        valimposto = (salariobase * 10f) / 100f;
        salreceber = (salariobase + 50) - valimposto;

        System.out.println(" O salario a receber e:" + salreceber);
    }
    
}
