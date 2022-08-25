//38) Faça um programa que receba o preço de um produto e o seu código de origem e mostre a sua procedência. A procedência obedece a tabela a seguir:
//Código de origem    Procedência
//1                               Sul
//2                               Norte
//3                               Leste
//4                               Oeste
//5 ou 6                          Noroeste
//7 ou 8 ou 9                     Sudeste
//10 a 20                         Centro-Oeste
//21 a 30                         Nordeste
 

import java.util.Scanner;

public class Exercicico38 {
    public static void main(String[] args) {
        
        int precodoproduto = 0;
        int coddeorigem = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o preço do produto");
        precodoproduto = Integer.parseInt(leitor.nextLine());

        System.out.println(" Digite o codigo de origem");
        coddeorigem = Integer.parseInt(leitor.nextLine());

        if(coddeorigem == 1){
            System.out.println("Sul");
        }else {
            if(coddeorigem == 2){
                System.out.println("Norte");
            }else{
                if(coddeorigem == 3){
                    System.out.println("Leste");
                }else{
                    if(coddeorigem == 4){
                    System.out.println("Oeste");
                }else {
                    if(coddeorigem == 5 || coddeorigem == 6 ){
                     System.out.println("Noroeste");
                    }else{
                        if(coddeorigem == 7 || coddeorigem == 8 || coddeorigem == 9){
                         System.out.println("Sudeste");
                        }else{
                            if(coddeorigem >= 10 || coddeorigem <=20){
                                System.out.println("Centro-Oeste");
                            }else{
                                if(coddeorigem >= 21 || coddeorigem <= 30){
                                    System.out.println("Nordeste");
                                

                                }
                            }
                        }
                     }
                  }
                }
            }
        }
    }
}
    
    

