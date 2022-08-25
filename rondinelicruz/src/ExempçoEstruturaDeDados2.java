import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ExempçoEstruturaDeDados2 {
    public static void main(String[] args) {
        
        int[] numero = new int[10];
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros2[0]);

        char[] nome = {'u','n','i','v','i','l','l','e'};

        for(char umaLetra : nome){
            System.out.println((int)umaLetra);

        }

        String nome2 = "univille"; // string pool
        System.out.println(nome2.hashCode());// senha
        System.out.println(nome2);
        System.out.println(nome2.toUpperCase());
        // STRINGS SÃO IMUTÁVEIS
        nome2 = "UNIVILLE";
        System.out.println(nome2.hashCode());

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite UNIVILLE");
        String entrada = leitor.nextLine();

        if(nome2.equals( entrada)){
            //equalsIgnoreCase para ignorar letra maiuscula ou minuscula
            // String nunca muda
            System.out.println("São Iguais");
        }else{
            System.out.println("Não são iguais");
        }

        
    }

    
}
