/* 
Exercício-01.

Crie uma classe chamada BalancoTrimestral com um bloco main, dentro do main (o miolo do programa), declare uma variável inteira chamada
gastosAbril e inicialize-a como o valor de um salário mínimo;
Exiba o salário-mínimo mutiplicado por 10. 

*/

public class BalancoTrimestral{
    public static void main(String[] args) {

        double gastosAbril = 1212.00; //Valor salário mínimo.

        System.out.printf("Valor salário mínimo: %.2f R$",gastosAbril," R$");
        System.out.printf("\nValor salário mínimo multiplicado x10: %.2f R$", (gastosAbril * 10)," R$");
        
    }

}
