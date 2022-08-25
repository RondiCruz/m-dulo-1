import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        
    float nota1 = 0;
    float nota2 = 0;
    float nota3 = 0;
    float notaexame = 0;
    float media = 0;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite a primeira nota");
    nota1 = Float.parseFloat(leitor.nextLine());
    System.out.println("Digite a segunda nota");
    nota2 = Float.parseFloat(leitor.nextLine());
    System.out.println("Digite a terceira nota");
    nota3 = Float.parseFloat(leitor.nextLine());

    media = ( nota1 + nota2 + nota3 ) / 3;
    // Operador E = &&
    // Operador OU = ||
    // Operador não ! (!= / ==)

    if (media >= 7 && media <=10){
        System.out.println("Aprovado sua media e" + media);
        // SIM
    }else{
        //NÂO
        if (media >= 3 && media < 7){
            notaexame = 10 - media;
            System.out.println("Exame sua nota e " + notaexame);
        }else{
            System.out.println("Voce esta REPROVADO");
        }
    }





    

    




    }
    
}
