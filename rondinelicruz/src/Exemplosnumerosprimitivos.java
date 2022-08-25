public class Exemplosnumerosprimitivos {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //ENTRADAS
        //int significa tipo de informação inteiro
        //ATRIBUIÇÃO DE VALOR - variavel = valor;
        int primeironumero = 7;
        int segundonumero = 2;

        //PROCESSAMENTO
        //ATRIBUIÇÃO DE VALOR
        int resultado = primeironumero + segundonumero;

        //SAIDA
        System.out.print("O resultado é: ");
        System.out.println(resultado);
        
        //CONCATENAÇÃO
        System.out.println("O resultado é: " + resultado);
        //Interpolação de String
        System.out.println(String.format("O resultado e: %d", resultado));

        //subtração      -
        int resultadosub = 0;
        resultadosub = primeironumero - segundonumero;
        System.out.println("O resultado da subtracao e " + resultadosub);
        //System.out.println("O resultado da subtracao e " + (primeironumero - segundonumero));
        //divisão        /

        float resultadodiv = (float)primeironumero / (float)segundonumero;
        System.out.println("O resultado da divisão: " + resultadodiv);
        System.out.println(String.format("O resultado da divisão: %.3f" , resultadodiv));

        double resultadodivdouble = (double)primeironumero / (double)segundonumero;
        System.out.println(String.format("O resultado da divisão: %4.3f" , resultadodivdouble));


        //multiplicação  *
        int resultadomult = primeironumero * segundonumero;
        System.out.println("O resultado da multiplicação e: " + resultadomult);

        //tipo logico (booleano) = true ou false
        boolean resultadocomparacao = primeironumero == segundonumero;
        System.out.println(resultadocomparacao);
        System.out.println(resultadocomparacao?"Verdadeiro":"Falso");

        String nome = "Walter Silvestre Coan";

        System.out.println(nome.replace("a", "$"));
        char umaLetra = 'a';
        System.out.println(umaLetra);
        System.out.println((int)umaLetra);

        long numeromuitogrande = 10L;
        System.out.println (numeromuitogrande);

        long numeromuitogrande2 = 10L;
        //ERRO: a váriavel int não suporta o valor long por conta do tamanho
        // INT: vaidarruim = 10L:
        
        System.out.println (numeromuitogrande);

        int salario = (int)1210.5f;
        System.out.println(salario);

        float imposto = 1000.0f;
        // o double tem 64bits e não cabe dentro float 32bits
        // float imposto = 1000.0; 


    }
}
