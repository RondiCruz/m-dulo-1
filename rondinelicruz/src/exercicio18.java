import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {

        float tempcelsius=0;
        float tempfahrenheit = 0;
        Scanner leitor = new Scanner(System.in);
 
        System.out.println("Digite a temperatura em celsius");
        tempcelsius = Float.parseFloat(leitor.nextLine());
 
        tempfahrenheit = tempcelsius * 1.8f + 32f;
 
        System.out.println("A temperatura e: " + tempfahrenheit + " F");
        
        
    }
    
}
