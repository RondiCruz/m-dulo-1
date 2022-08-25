import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        
        float horas = 0;
        float minutos = 0;
        float horasemminutos = 0;
        float totminutos = 0;
        float totsegundos = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor das horas");
        horas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor dos minutos");
        minutos = Float.parseFloat(leitor.nextLine());

        horasemminutos = horas * 60f;
        totminutos = minutos + horasemminutos;
        totsegundos = totminutos * 60f;

        System.out.println("O valor das horas em minutos e " + horasemminutos);
        System.out.println("O valor total de minutos e " + totminutos);
        System.out.println("O valor total de segundos e " + totsegundos);
    }
    
}
