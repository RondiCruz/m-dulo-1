import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        
        int idade = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite a sua idade");
        idade = Integer.parseInt(leitor.nextLine());

        if (idade>= 18){ 
            // ENTÃO SIM ( THEN)
            System.out.println(" Voce é maior de idade");
    
        }else{
            // SENÃO NÃO ( ELSE)
            System.out.println(" Voce é menor de idade");
        }
    }
    
}
