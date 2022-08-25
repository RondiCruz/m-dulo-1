import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
        
        int umnumero = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite um numero");
        umnumero = Integer.parseInt(leitor.nextLine());

        if (umnumero % 2 == 0){
            System.out.println("Numero é PAR");
        }else{
            System.out.println("Numero não é PAR");
        }
    }
    
}
