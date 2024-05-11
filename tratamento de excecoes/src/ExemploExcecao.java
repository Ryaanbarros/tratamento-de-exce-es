//Vamos imaginar que precisamos realizar de duas maneiras, a conversão de uma String para um número, porém o texto contém Alfanuméricos.

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
       // Number valor = Double.valueOf("a1.75");
         //se clicar com o ctrl emcima de um metodo que não conhece ele vai direcionar a proposta do metodo, por exemplo clicar com o ctrl em cima do valueOf
        // esse é um exemplo de uma exceção que pode ser lançada, mas antes precisamos testa-la e nos como desenvolvedores não nos preocupados em pedir para o usuario tratar
       Number valor;
    try {
        valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);
    } catch (ParseException e) {   //A proposta de exceções checadas e não checadas é o fato de ao tentar usar o metodo, esse metodo determina que você precisa algum erro imediatamente, diferentemente da runtimeexception que o erro pode acontecer mas você não tratou porque eles detectaram ou perceberam que poderia ser um erro não tão recorrente
        e.printStackTrace();
    }
    }
}
