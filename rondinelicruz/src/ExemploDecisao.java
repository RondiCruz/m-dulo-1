import java.util.Scanner;

public class ExemploDecisao {
    public static void main(String[] args) {
        
        int numero = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite um numero");
        numero = Integer . parseInt(leitor.nextLine());
        /*
        if(ondição / Teste){
            //bloco de codigo (Entao - Verdadeiro)
        }else{
            //bloco de codigo (Senão - Falso)
        }
        */

        if (numero >= 10) {
            System.out.println(" o numero maior que dez");
    
        }else{
            System.out.println(" o numero menor que dez");
        }

    
    }
    
}
