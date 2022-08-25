import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        float lado = 0;
        float area = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o tamanho de um dos lados? ");
        lado = Float.parseFloat(leitor.nextLine());
        area = lado * lado;

        System.out.println(" A area do quadrado e: " + area );
        

    }
    
}
