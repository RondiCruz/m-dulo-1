
/*56) Elabore um programa que apresente no final o somatório dos valores 
   pares existentes na faixa de 1 até 500. */
 


public class Exercicio56 {
    public static void main(String[] args) {

        int soma = 0;
        for(int i=1; i <=500; i++){
            if (i % 2 ==0){
                System.out.println(i+"");
                soma = soma + i;
            }
        }
        System.out.println(" O total dos números pares de 1 a 500 e:" + soma);
    }
    
}
