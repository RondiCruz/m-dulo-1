import java.util.Scanner;

public class ExercicioIdades {
    public static void main(String[] args) {
        
        int idade = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite sua idade");
        idade = Integer.parseInt(leitor.nextLine());

        if (idade <= 20){
            // ENTÃO
            System.out.println(" Jovem");

        }else{
            //SENÃO
            if(idade <= 60){
                System.out.println(" Adulta");
            }else{
                System.out.println(" Idoso");
            }
        }

    }
    
}
