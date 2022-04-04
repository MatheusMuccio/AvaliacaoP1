/*

Exercício-03.

Crie uma classe com um vetor preenchido com todos os nomes dos cinco principais commodities agrícolas brasileiras e um
outro vetor com o  preço de cada um delas.
Exiba esses dois vetores. Exemplos de commodities agrícolas:

Soja; Trigo; Milho; Café; Laranja; Açúcar; Algodão; Carne.

No mercado de comodities agrícolas, estes itens podem ser negociados por meio de ações ou através do produto propriamente dito. Desta forma,
são negociadas a partir de quantidades pré-estabelecidas, por exemplo:

Sacos de grãos de soja (60 KG).
Arrobas de boi gordo (15KG).
Sacos de açúcar cristal (50KG).
Saca de café (60KG).
Algodão (1KG).
Saca de Milho (60KG).

*/

public class Commodities{

    public static void main(String[] args) {
        
        String commodities [] = new String [5];
        commodities[0] = "Arroz / 60 KG"; //60 KG
        commodities[1] = "Café / 60 KG"; //60 KG
        commodities[2] = "Carne (Boi Gordo) / 15 KG"; //Boi Gordo 15 KG
        commodities[3] = "Milho / 50 KG"; // 50 KG
        commodities[4] = "Soja / 60 KG"; // 60 KG

        double valores [] = new double [5];
        valores[0] = 89.00;
        valores[1] = 1236.00;
        valores[2] = 321.00;
        valores[3] = 110.00;
        valores[4] = 191.00;

        for (int index = 0; index < commodities.length; index++) {
            System.out.print("Commodities: ");
            System.out.println(commodities[index] + ": " + valores[index] + " R$");
            
        }
    }
}