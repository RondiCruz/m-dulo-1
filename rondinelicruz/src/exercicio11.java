import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        float pesoatual = 0;
        float pesoengordou = 0;
        float novopesoengorda = 0;
        float pesoemagrece = 0;
        float novopesoemagrece = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite seu peso atual");
        pesoatual = Float.parseFloat(leitor.nextLine());

        pesoengordou = (pesoatual * 15)  / 100;
        novopesoengorda = pesoatual + pesoengordou;

        pesoemagrece = (pesoatual * 20) / 100;
        novopesoemagrece = pesoatual - pesoemagrece;

        System.out.println(" o novo peso caso engordar é: " + novopesoengorda);
        System.out.println(" O novo peso caso emagreça é:" + novopesoemagrece);

    
        

    }
    
}
