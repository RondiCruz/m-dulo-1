import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        
        float basemaior = 0;
        float basemenor = 0;
        float altura    = 0;
        float area      = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o tamanho da base menor? ");
        basemenor = Float.parseFloat(leitor.nextLine());

        System.out.println(" Digite o tamanho da base maior? ");
        basemaior = Float.parseFloat(leitor.nextLine());

        System.out.println(" Digite o tamanho da altura?" );
        altura = Float.parseFloat(leitor.nextLine());

        area = ((basemaior + basemenor) * altura)  / 2f;

        System.out.println( " A area e;");




    }
    
}
