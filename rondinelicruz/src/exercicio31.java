import java.util.Scanner;

/*31)    Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados necessários para executar cada operação.
Menu de opções:
1.    Somar dois números
2.    Raiz quadrada de um número
Solicite ao usuário digitar a opção desejada */ 


public class exercicio31 {
    public static void main(String[] args) {

        int opcao = 0;
        float num1=0, num2=0, soma=0;
        int umnumero = 0;
        float resultado = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("+---------------------------+");
        System.out.println("|Digite 1 para soma         |");
        System.out.println("|Digite 2 para raiz quadrada|");
        System.out.println("+---------------------------+");
        opcao = Integer.parseInt(leitor.nextLine());
            
        if(opcao == 1){
            System.out.println("Digite o primeiro numero");
            num1 = Float.parseFloat(leitor.nextLine());
            System.out.println("Digite o segundo numero");
            num2 = Float.parseFloat(leitor.nextLine());
            soma = num1 + num2;
            System.out.println("A soma e " + soma);
        }else{
            System.out.println("Digite um numero");
            umnumero = Integer.parseInt(leitor.nextLine());
            resultado = (float)Math.sqrt(umnumero);
            System.out.println("O resultado e " + resultado);
        }
        

    }
    
}
