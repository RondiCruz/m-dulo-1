import java.util.Arrays;

/*81) Faça um programa que carregue dois vetores, X e Y, com dez números inteiros cada um. 
        Considere que os números de cada vetor digital, X e Y, não podem estar repetidos. 
        Calcule e mostre os seguintes vetores resultantes:
        - a união de X com Y (todos os elementos de X e os elementos de Y que não estejam em X)
        - a diferença entre X e Y (todos os elementos de X que não existam em Y)
        - a soma entre X e Y (soma de cada elemento de X com o elemento de mesma posição em Y)
        - produto entre X e Y (multiplicação de cada elemento de X com o elemento de mesma posição em Y)
        - a interseção entre X e Y (apenas os elementos que aparecem nos dois vetores) */


public class Exercicio81 {
    public static void main(String[] args) {

        int[] x = {1,2,3,4,5,6,7,8,9,0};
        int[] y = {1,20,3,40,5,60,7,80,9,100};
        //TODO: implementar a entrada
        int[] uniao = new int[20];

        //UNIAO
        for(int i=0;i<10;i++){
            uniao[i] = x[i];
        }
        int proxlivre = 10;
        for(int i=0;i<10;i++){
            System.out.println(y[i]);
            boolean achei = false;
            for(int j=0;j<10;j++){
                System.out.println("\t"+x[j]);
                if(y[i] == x[j]){
                    System.out.println("ACHEI!!!!");
                    achei = true;
                    break;
                }
            }
            if(achei == false){
                System.out.println("NAO ACHEI EM LUGAR NENHUM");
                uniao[proxlivre] = y[i];
                proxlivre = proxlivre + 1;
            }
        }

        System.out.println(Arrays.toString(uniao));
       


    }
    
}
