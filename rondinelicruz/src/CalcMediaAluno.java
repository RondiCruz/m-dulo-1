//Exemplo de git Pull //
import java.util.Scanner;

public class CalcMediaAluno {
    //aqui dentro
    public static void main(String[] args) {

        // Entradas
        // DECLARAÇÃO DE VARIÁVEIS

    
          final float nota1, nota2, nota3, nota4;
          float percPresenca = 0, media = 0;
         //float nota1=0, nota2=0, nota3=0, nota4=0; tirar o 0 para se tornal final
        // float nota1=0, nota2=0, nota3=0, nota4=0, media=0; Exemplo
        Scanner leitor = new Scanner(System.in);

        System.out.println( " Digite a primeira nota");
        // conversão entre tipo objeto para tipo primitivo

        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.println( " Digite a segunda nota");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println( " Digite a terceira nota");
        nota3 = Float.parseFloat(leitor.nextLine());
        System.out.println( " Digite a quarta nota");
        nota4 = Float.parseFloat(leitor.nextLine());

        System.out.println("digite o percentual de presença do aluno");
        // converte o texto digitado ( nextline) de String para um primitivo float
        percPresenca = Float.parseFloat(leitor.nextLine());

        // constante + modificador final
        // " tipo" a palavra VAR permite que o JAVA
        //  crie a variável com o tipo do valor 
        // que foi atribuido no código 
        // Variável - tipo nome = valor
        media = (nota1 + nota2 + nota3 + nota4) / 4.0f;
       // AND && - OR || - NOT !

       // comparação de valores 

       // REGRA aluno aprovado = media > 7
       // REGRA aluno aprovado = percPrenca >= 75
       boolean situacao = media >= 7 && percPresenca >= 75; 
       

       // media = 0;
       System.out.println("Situação: " + ( situacao? "Aprovado":"Reprovado"));

        System.out.println("a media do aluno e " + media);

        leitor.close();



        
        
        
        

        
        
        
        
    }

    
}
